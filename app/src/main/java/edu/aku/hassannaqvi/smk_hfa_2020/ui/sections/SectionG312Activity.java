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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG312Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionG312Activity extends AppCompatActivity {

    ActivitySectionG312Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g312);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g0401120s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401120sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401120so);
            }
        }));

        bi.g0401130s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401130sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401130so);
            }
        }));

        bi.g0401140s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401140sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401140so);
            }
        }));

        bi.g0401150s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401150sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401150so);
            }
        }));

        bi.g0401160s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401160sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401160so);
            }
        }));

        bi.g0401170s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401170sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401170so);
            }
        }));

        bi.g0401180s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401180sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401180so);
            }
        }));

        bi.g0401190s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401190sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401190so);
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


        json.put("g3112a", bi.g3112ay.isChecked() ? "1"
                : bi.g3112an.isChecked() ? "2"
                : "-1");

        json.put("g3112s", bi.g3112sy.isChecked() ? "1"
                : bi.g3112sn.isChecked() ? "2"
                : "-1");

        json.put("g3112so", bi.g3112sod.isChecked() ? "1"
                : bi.g3112som.isChecked() ? "2"
                : "-1");

        json.put("g3112sodx", bi.g3112sodx.getText().toString());
        json.put("g3112somx", bi.g3112somx.getText().toString());
        json.put("g3113a", bi.g3113ay.isChecked() ? "1"
                : bi.g3113an.isChecked() ? "2"
                : "-1");

        json.put("g3113s", bi.g3113sy.isChecked() ? "1"
                : bi.g3113sn.isChecked() ? "2"
                : "-1");

        json.put("g3113so", bi.g3113sod.isChecked() ? "1"
                : bi.g3113som.isChecked() ? "2"
                : "-1");

        json.put("g3113sodx", bi.g3113sodx.getText().toString());
        json.put("g3113somx", bi.g3113somx.getText().toString());
        json.put("g3114a", bi.g3114ay.isChecked() ? "1"
                : bi.g3114an.isChecked() ? "2"
                : "-1");

        json.put("g3114s", bi.g3114sy.isChecked() ? "1"
                : bi.g3114sn.isChecked() ? "2"
                : "-1");

        json.put("g3114so", bi.g3114sod.isChecked() ? "1"
                : bi.g3114som.isChecked() ? "2"
                : "-1");

        json.put("g3114sodx", bi.g3114sodx.getText().toString());
        json.put("g3114somx", bi.g3114somx.getText().toString());
        json.put("g3115a", bi.g3115ay.isChecked() ? "1"
                : bi.g3115an.isChecked() ? "2"
                : "-1");

        json.put("g3115s", bi.g3115sy.isChecked() ? "1"
                : bi.g3115sn.isChecked() ? "2"
                : "-1");

        json.put("g3115so", bi.g3115sod.isChecked() ? "1"
                : bi.g3115som.isChecked() ? "2"
                : "-1");

        json.put("g3115sodx", bi.g3115sodx.getText().toString());
        json.put("g3115somx", bi.g3115somx.getText().toString());
        json.put("g3116a", bi.g3116ay.isChecked() ? "1"
                : bi.g3116an.isChecked() ? "2"
                : "-1");

        json.put("g3116s", bi.g3116sy.isChecked() ? "1"
                : bi.g3116sn.isChecked() ? "2"
                : "-1");

        json.put("g3116so", bi.g3116sod.isChecked() ? "1"
                : bi.g3116som.isChecked() ? "2"
                : "-1");

        json.put("g3116sodx", bi.g3116sodx.getText().toString());
        json.put("g3116somx", bi.g3116somx.getText().toString());
        json.put("g3117a", bi.g3117ay.isChecked() ? "1"
                : bi.g3117an.isChecked() ? "2"
                : "-1");

        json.put("g3117s", bi.g3117sy.isChecked() ? "1"
                : bi.g3117sn.isChecked() ? "2"
                : "-1");

        json.put("g3117so", bi.g3117sod.isChecked() ? "1"
                : bi.g3117som.isChecked() ? "2"
                : "-1");

        json.put("g3117sodx", bi.g3117sodx.getText().toString());
        json.put("g3117somx", bi.g3117somx.getText().toString());
        json.put("g3118a", bi.g3118ay.isChecked() ? "1"
                : bi.g3118an.isChecked() ? "2"
                : "-1");

        json.put("g3118s", bi.g3118sy.isChecked() ? "1"
                : bi.g3118sn.isChecked() ? "2"
                : "-1");

        json.put("g3118so", bi.g3118sod.isChecked() ? "1"
                : bi.g3118som.isChecked() ? "2"
                : "-1");

        json.put("g3118sodx", bi.g3118sodx.getText().toString());
        json.put("g3118somx", bi.g3118somx.getText().toString());
        json.put("g3119a", bi.g3119ay.isChecked() ? "1"
                : bi.g3119an.isChecked() ? "2"
                : "-1");

        json.put("g3119s", bi.g3119sy.isChecked() ? "1"
                : bi.g3119sn.isChecked() ? "2"
                : "-1");

        json.put("g3119so", bi.g3119sod.isChecked() ? "1"
                : bi.g3119som.isChecked() ? "2"
                : "-1");

        json.put("g3119sodx", bi.g3119sodx.getText().toString());
        json.put("g3119somx", bi.g3119somx.getText().toString());


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
            startActivity(new Intent(this, SectionG313Activity.class));
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
