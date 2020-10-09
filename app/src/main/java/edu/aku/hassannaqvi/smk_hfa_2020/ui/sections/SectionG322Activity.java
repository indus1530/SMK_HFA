package edu.aku.hassannaqvi.smk_hfa_2020.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_hfa_2020.R;
import edu.aku.hassannaqvi.smk_hfa_2020.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_hfa_2020.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp;
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG322Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionG322Activity extends AppCompatActivity {

    ActivitySectionG322Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g322);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g040310s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040310sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040310so);
            }
        }));

        bi.g040320s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040320sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040320so);
            }
        }));

        bi.g040330s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040330sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040330so);
            }
        }));

        bi.g040340s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040340sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040340so);
            }
        }));

        bi.g040350s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040350sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040350so);
            }
        }));

        bi.g040360s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040360sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040360so);
            }
        }));

        bi.g040370s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040370sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040370so);
            }
        }));

        bi.g040380s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040380sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040380so);
            }
        }));

        bi.g040390s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040390sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040390so);
            }
        }));

    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SG, fc.getsG());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();


        json.put("g3301a", bi.g3301ay.isChecked() ? "1"
                : bi.g3301an.isChecked() ? "2"
                : "-1");

        json.put("g3301s", bi.g3301sy.isChecked() ? "1"
                : bi.g3301sn.isChecked() ? "2"
                : "-1");

        json.put("g3301so", bi.g3301sod.isChecked() ? "1"
                : bi.g3301som.isChecked() ? "2"
                : "-1");

        json.put("g3301sodx", bi.g3301sodx.getText().toString());
        json.put("g3301somx", bi.g3301somx.getText().toString());
        json.put("g3301p", bi.g3301py.isChecked() ? "1"
                : bi.g3301pn.isChecked() ? "2"
                : "-1");

        json.put("g3302a", bi.g3302ay.isChecked() ? "1"
                : bi.g3302an.isChecked() ? "2"
                : "-1");

        json.put("g3302s", bi.g3302sy.isChecked() ? "1"
                : bi.g3302sn.isChecked() ? "2"
                : "-1");

        json.put("g3302so", bi.g3302sod.isChecked() ? "1"
                : bi.g3302som.isChecked() ? "2"
                : "-1");

        json.put("g3302sodx", bi.g3302sodx.getText().toString());
        json.put("g3302somx", bi.g3302somx.getText().toString());
        json.put("g3302p", bi.g3302py.isChecked() ? "1"
                : bi.g3302pn.isChecked() ? "2"
                : "-1");

        json.put("g3303a", bi.g3303ay.isChecked() ? "1"
                : bi.g3303an.isChecked() ? "2"
                : "-1");

        json.put("g3303s", bi.g3303sy.isChecked() ? "1"
                : bi.g3303sn.isChecked() ? "2"
                : "-1");

        json.put("g3303so", bi.g3303sod.isChecked() ? "1"
                : bi.g3303som.isChecked() ? "2"
                : "-1");

        json.put("g3303sodx", bi.g3303sodx.getText().toString());
        json.put("g3303somx", bi.g3303somx.getText().toString());
        json.put("g3303p", bi.g3303py.isChecked() ? "1"
                : bi.g3303pn.isChecked() ? "2"
                : "-1");

        json.put("g3304a", bi.g3304ay.isChecked() ? "1"
                : bi.g3304an.isChecked() ? "2"
                : "-1");

        json.put("g3304s", bi.g3304sy.isChecked() ? "1"
                : bi.g3304sn.isChecked() ? "2"
                : "-1");

        json.put("g3304so", bi.g3304sod.isChecked() ? "1"
                : bi.g3304som.isChecked() ? "2"
                : "-1");

        json.put("g3304sodx", bi.g3304sodx.getText().toString());
        json.put("g3304somx", bi.g3304somx.getText().toString());
        json.put("g3304p", bi.g3304py.isChecked() ? "1"
                : bi.g3304pn.isChecked() ? "2"
                : "-1");

        json.put("g3305a", bi.g3305ay.isChecked() ? "1"
                : bi.g3305an.isChecked() ? "2"
                : "-1");

        json.put("g3305s", bi.g3305sy.isChecked() ? "1"
                : bi.g3305sn.isChecked() ? "2"
                : "-1");

        json.put("g3305so", bi.g3305sod.isChecked() ? "1"
                : bi.g3305som.isChecked() ? "2"
                : "-1");

        json.put("g3305sodx", bi.g3305sodx.getText().toString());
        json.put("g3305somx", bi.g3305somx.getText().toString());
        json.put("g3305p", bi.g3305py.isChecked() ? "1"
                : bi.g3305pn.isChecked() ? "2"
                : "-1");

        json.put("g3306a", bi.g3306ay.isChecked() ? "1"
                : bi.g3306an.isChecked() ? "2"
                : "-1");

        json.put("g3306s", bi.g3306sy.isChecked() ? "1"
                : bi.g3306sn.isChecked() ? "2"
                : "-1");

        json.put("g3306so", bi.g3306sod.isChecked() ? "1"
                : bi.g3306som.isChecked() ? "2"
                : "-1");

        json.put("g3306sodx", bi.g3306sodx.getText().toString());
        json.put("g3306somx", bi.g3306somx.getText().toString());
        json.put("g3306p", bi.g3306py.isChecked() ? "1"
                : bi.g3306pn.isChecked() ? "2"
                : "-1");


        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(MainApp.fc.getsG()), json);

            MainApp.fc.setsG(String.valueOf(json_merge));

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void BtnContinue() {
        if (!formValidation()) return;
        try {
            SaveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, SectionG323Activity.class));
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }


    public void BtnEnd() {
        openSectionMainActivity(this, "G");
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}
