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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG315Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionG315Activity extends AppCompatActivity {

    ActivitySectionG315Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g315);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g0401400s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401400sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401400so);
            }
        }));

        bi.g0401410s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401410sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401410so);
            }
        }));

        bi.g0401420s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401420sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401420so);
            }
        }));

        bi.g0401430s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401430sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401430so);
            }
        }));

        bi.g0401440s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401440sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401440so);
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


        json.put("g3140a", bi.g3140ay.isChecked() ? "1"
                : bi.g3140an.isChecked() ? "2"
                : "-1");

        json.put("g3140s", bi.g3140sy.isChecked() ? "1"
                : bi.g3140sn.isChecked() ? "2"
                : "-1");

        json.put("g3140so", bi.g3140sod.isChecked() ? "1"
                : bi.g3140som.isChecked() ? "2"
                : "-1");

        json.put("g3140sodx", bi.g3140sodx.getText().toString());
        json.put("g3140somx", bi.g3140somx.getText().toString());
        json.put("g3141a", bi.g3141ay.isChecked() ? "1"
                : bi.g3141an.isChecked() ? "2"
                : "-1");

        json.put("g3141s", bi.g3141sy.isChecked() ? "1"
                : bi.g3141sn.isChecked() ? "2"
                : "-1");

        json.put("g3141so", bi.g3141sod.isChecked() ? "1"
                : bi.g3141som.isChecked() ? "2"
                : "-1");

        json.put("g3141sodx", bi.g3141sodx.getText().toString());
        json.put("g3141somx", bi.g3141somx.getText().toString());
        json.put("g3142a", bi.g3142ay.isChecked() ? "1"
                : bi.g3142an.isChecked() ? "2"
                : "-1");

        json.put("g3142s", bi.g3142sy.isChecked() ? "1"
                : bi.g3142sn.isChecked() ? "2"
                : "-1");

        json.put("g3142so", bi.g3142sod.isChecked() ? "1"
                : bi.g3142som.isChecked() ? "2"
                : "-1");

        json.put("g3142sodx", bi.g3142sodx.getText().toString());
        json.put("g3142somx", bi.g3142somx.getText().toString());
        json.put("g3143a", bi.g3143ay.isChecked() ? "1"
                : bi.g3143an.isChecked() ? "2"
                : "-1");

        json.put("g3143s", bi.g3143sy.isChecked() ? "1"
                : bi.g3143sn.isChecked() ? "2"
                : "-1");

        json.put("g3143so", bi.g3143sod.isChecked() ? "1"
                : bi.g3143som.isChecked() ? "2"
                : "-1");

        json.put("g3143sodx", bi.g3143sodx.getText().toString());
        json.put("g3143somx", bi.g3143somx.getText().toString());
        json.put("g3144a", bi.g3144ay.isChecked() ? "1"
                : bi.g3144an.isChecked() ? "2"
                : "-1");

        json.put("g3144s", bi.g3144sy.isChecked() ? "1"
                : bi.g3144sn.isChecked() ? "2"
                : "-1");

        json.put("g3144so", bi.g3144sod.isChecked() ? "1"
                : bi.g3144som.isChecked() ? "2"
                : "-1");

        json.put("g3144sodx", bi.g3144sodx.getText().toString());
        json.put("g3144somx", bi.g3144somx.getText().toString());


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
            startActivity(new Intent(this, SectionG321Activity.class));
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
