package edu.aku.hassannaqvi.smk_hfa_2020.ui.other;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.smk_hfa_2020.R;
import edu.aku.hassannaqvi.smk_hfa_2020.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_hfa_2020.contracts.PatientsContract;
import edu.aku.hassannaqvi.smk_hfa_2020.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp;
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivityEndingBinding;
import edu.aku.hassannaqvi.smk_hfa_2020.ui.sections.SectionAActivity;

import static edu.aku.hassannaqvi.smk_hfa_2020.CONSTANTS.SECTION_MAIN_CHECK_FOR_END;

public class EndingActivity extends AppCompatActivity {

    ActivityEndingBinding bi;
    boolean sectionMainCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_ending);
        bi.setCallback(this);

        boolean check = getIntent().getBooleanExtra("complete", false);
        sectionMainCheck = getIntent().getBooleanExtra(SECTION_MAIN_CHECK_FOR_END, false);

        if (check) {
            bi.istatusa.setEnabled(true);
            bi.istatusb.setEnabled(false);
            bi.istatus96.setEnabled(false);
        } else {
            bi.istatusa.setEnabled(false);
            bi.istatusb.setEnabled(true);
            bi.istatus96.setEnabled(true);
        }

//
    }


    public void BtnEnd() {
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                finish();
                startActivity(new Intent(this, sectionMainCheck ? routingSelectionForChildEnding() : MainActivity.class));
            } else {
                Toast.makeText(this, "Error in updating db!!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private Class<?> routingSelectionForChildEnding() {
        /*if (MainApp.fc.getA10().equals("1") && SectionMainActivity.countI == 6)
            return SectionMainActivity.class;
        else if (MainApp.fc.getA10().equals("2") && SectionMainActivity.countI == 3)
            return SectionMainActivity.class;
        else
            return SectionI1Activity.class;*/
        return SectionMainActivity.class;
    }


    private void SaveDraft() {

        if (sectionMainCheck) {
            MainApp.psc.setStatus(bi.istatusa.isChecked() ? "1"
                    : bi.istatusb.isChecked() ? "2"
                    : bi.istatus96.isChecked() ? "96"
                    : "0");
            MainApp.fc.setsI(String.valueOf(SectionAActivity.countI));
        } else {
            MainApp.fc.setIstatus(bi.istatusa.isChecked() ? "1"
                    : bi.istatusb.isChecked() ? "2"
                    : bi.istatus96.isChecked() ? "96"
                    : "0");

            MainApp.fc.setIstatus88x(bi.istatus96x.getText().toString());
            MainApp.fc.setEndingdatetime(new SimpleDateFormat("dd-MM-yy HH:mm", Locale.getDefault()).format(new Date().getTime()));
        }
    }


    public boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount;
        if (sectionMainCheck) {
            updcount = db.updatesPSCColumn(PatientsContract.PatientsTable.COLUMN_STATUS, MainApp.psc.getStatus());
            if (updcount == 1)
                updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SI, MainApp.fc.getsI());
        } else
            updcount = db.updateEnding();

        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.fldGrpEnd);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Back Press Not Allowed", Toast.LENGTH_LONG).show();
    }

}
