package edu.aku.hassannaqvi.smk_hfa_2020.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.smk_hfa_2020.R;
import edu.aku.hassannaqvi.smk_hfa_2020.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_hfa_2020.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp;
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionE101Binding;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;

public class SectionE101Activity extends AppCompatActivity {

    ActivitySectionE101Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e101);
        bi.setCallback(this);
        setupSkips();
    }

    private void setupSkips() {

        bi.e14a.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e14ab.getId()) {
                Clear.clearAllFields(bi.fldGrpe14a);
            }
        }));

        bi.e11.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.e11b.getId()) {
                Clear.clearAllFields(bi.fldGrpe11);
            }
        }));
    }

    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SE, fc.getsE());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("e11", bi.e11a.isChecked() ? "1"
                : bi.e11b.isChecked() ? "2"
                :  "-1");

        json.put("e12a2a", bi.e12aa.isChecked() ? "1"
                : bi.e12ab.isChecked() ? "2"
                :  "-1");

        json.put("e12b2b", bi.e12ba.isChecked() ? "1"
                : bi.e12bb.isChecked() ? "2"
                :  "-1");

        json.put("e12c2c", bi.e12ca.isChecked() ? "1"
                : bi.e12cb.isChecked() ? "2"
                :  "-1");

        json.put("e12d2d", bi.e12da.isChecked() ? "1"
                : bi.e12db.isChecked() ? "2"
                :  "-1");

        json.put("e12e2e", bi.e12ea.isChecked() ? "1"
                : bi.e12eb.isChecked() ? "2"
                :  "-1");

        json.put("e12f2f", bi.e12fa.isChecked() ? "1"
                : bi.e12fb.isChecked() ? "2"
                :  "-1");

        json.put("e12g2g", bi.e12ga.isChecked() ? "1"
                : bi.e12gb.isChecked() ? "2"
                :  "-1");

        json.put("e12h2h", bi.e12ha.isChecked() ? "1"
                : bi.e12hb.isChecked() ? "2"
                :  "-1");

        json.put("e12i2i", bi.e12ia.isChecked() ? "1"
                : bi.e12ib.isChecked() ? "2"
                :  "-1");

        json.put("e12j2j", bi.e12ja.isChecked() ? "1"
                : bi.e12jb.isChecked() ? "2"
                :  "-1");

        json.put("e13a", bi.e13aa.isChecked() ? "1"
                : bi.e13ab.isChecked() ? "2"
                : bi.e13ac.isChecked() ? "3"
                :  "-1");

        json.put("e13b", bi.e13ba.isChecked() ? "1"
                : bi.e13bb.isChecked() ? "2"
                : bi.e13bc.isChecked() ? "3"
                :  "-1");

        json.put("e14a", bi.e14aa.isChecked() ? "1"
                : bi.e14ab.isChecked() ? "2"
                :  "-1");

        json.put("e14b", bi.e14ba.isChecked() ? "1"
                : bi.e14bb.isChecked() ? "2"
                :  "-1");

        json.put("e14c", bi.e14c.getText().toString());

        json.put("e14d", bi.e14d.getText().toString());

        json.put("e14e", bi.e14ea.isChecked() ? "1"
                : bi.e14ex.isChecked() ? "96"
                :  "-1");

        json.put("e14exx", bi.e14exx.getText().toString());
        json.put("e151aav", bi.e151aavy.isChecked() ? "1"
                : bi.e151aavn.isChecked() ? "2"
                :  "-1");

        json.put("e151af", bi.e151afy.isChecked() ? "1"
                : bi.e151afn.isChecked() ? "2"
                :  "-1");

        json.put("e151bav", bi.e151bavy.isChecked() ? "1"
                : bi.e151bavn.isChecked() ? "2"
                :  "-1");

        json.put("e151bf", bi.e151bfy.isChecked() ? "1"
                : bi.e151bfn.isChecked() ? "2"
                :  "-1");

        json.put("e151cav", bi.e151cavy.isChecked() ? "1"
                : bi.e151cavn.isChecked() ? "2"
                :  "-1");

        json.put("e151cf", bi.e151cfy.isChecked() ? "1"
                : bi.e151cfn.isChecked() ? "2"
                :  "-1");

        json.put("e151dav", bi.e151davy.isChecked() ? "1"
                : bi.e151davn.isChecked() ? "2"
                :  "-1");

        json.put("e151df", bi.e151dfy.isChecked() ? "1"
                : bi.e151dfn.isChecked() ? "2"
                :  "-1");

        json.put("e151eav", bi.e151eavy.isChecked() ? "1"
                : bi.e151eavn.isChecked() ? "2"
                :  "-1");

        json.put("e151ef", bi.e151efy.isChecked() ? "1"
                : bi.e151efn.isChecked() ? "2"
                :  "-1");

        json.put("e152aav", bi.e152aavy.isChecked() ? "1"
                : bi.e152aavn.isChecked() ? "2"
                :  "-1");

        json.put("e152af", bi.e152afy.isChecked() ? "1"
                : bi.e152afn.isChecked() ? "2"
                :  "-1");

        json.put("e152bav", bi.e152bavy.isChecked() ? "1"
                : bi.e152bavn.isChecked() ? "2"
                :  "-1");

        json.put("e152bf", bi.e152bfy.isChecked() ? "1"
                : bi.e152bfn.isChecked() ? "2"
                :  "-1");

        json.put("e152cav", bi.e152cavy.isChecked() ? "1"
                : bi.e152cavn.isChecked() ? "2"
                :  "-1");

        json.put("e152cf", bi.e152cfy.isChecked() ? "1"
                : bi.e152cfn.isChecked() ? "2"
                :  "-1");

        json.put("e152dav", bi.e152davy.isChecked() ? "1"
                : bi.e152davn.isChecked() ? "2"
                :  "-1");

        json.put("e152df", bi.e152dfy.isChecked() ? "1"
                : bi.e152dfn.isChecked() ? "2"
                :  "-1");

        json.put("e152eav", bi.e152eavy.isChecked() ? "1"
                : bi.e152eavn.isChecked() ? "2"
                :  "-1");

        json.put("e152ef", bi.e152efy.isChecked() ? "1"
                : bi.e152efn.isChecked() ? "2"
                :  "-1");

        json.put("e152fav", bi.e152favy.isChecked() ? "1"
                : bi.e152favn.isChecked() ? "2"
                :  "-1");

        json.put("e152ff", bi.e152ffy.isChecked() ? "1"
                : bi.e152ffn.isChecked() ? "2"
                :  "-1");

        json.put("e152gav", bi.e152gavy.isChecked() ? "1"
                : bi.e152gavn.isChecked() ? "2"
                :  "-1");

        json.put("e152gf", bi.e152gfy.isChecked() ? "1"
                : bi.e152gfn.isChecked() ? "2"
                :  "-1");
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
            startActivity(new Intent(this, bi.e11b.isChecked() ? SectionE2Activity.class : SectionE102Activity.class));
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }

    public void BtnEnd() {
        openSectionMainActivity(this, "E");
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void showTooltip(@NotNull View view) {
        if (view.getId() != View.NO_ID) {
            String package_name = getApplicationContext().getPackageName();
            String infoid = view.getResources().getResourceName(view.getId()).replace(package_name + ":id/q_", "");
            int stringRes = this.getResources().getIdentifier(infoid + "_info", "string", getApplicationContext().getPackageName());
            //String infoText = (String) getResources().getText(stringRes);
            if (stringRes != 0) {
                String infoText = (String) getResources().getText(stringRes);

                new AlertDialog.Builder(this)
                        .setTitle("Info: " + infoid.toUpperCase())
                        .setMessage(infoText)
                        .setIcon(android.R.drawable.ic_dialog_info)
                        .show();
            } else {
                Toast.makeText(this, "No information available on this question.", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "No ID Associated with this question.", Toast.LENGTH_SHORT).show();

        }
    }

}
