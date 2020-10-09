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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG311Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionG311Activity extends AppCompatActivity {

    ActivitySectionG311Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g311);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g040110s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040110sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040110so);
            }
        }));


        bi.g040120s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040120sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040120so);
            }
        }));

        bi.g04010s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g04010sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg04010so);
            }
        }));

        bi.g040150s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040150sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040150so);
            }
        }));

        bi.g040160s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040160sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040160so);
            }
        }));

        bi.g040170s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040170sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040170so);
            }
        }));

        bi.g040180s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040180sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040180so);
            }
        }));

        bi.g040190s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040190sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040190so);
            }
        }));

        bi.g0401100s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401100sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401100so);
            }
        }));

        bi.g0401110s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401110sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401110so);
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

        json.put("g3101a", bi.g3101ay.isChecked() ? "1"
                : bi.g3101an.isChecked() ? "2"
                : "-1");

        json.put("g3101s", bi.g3101sy.isChecked() ? "1"
                : bi.g3101sn.isChecked() ? "2"
                : "-1");

        json.put("g3101so", bi.g3101sd.isChecked() ? "1"
                : bi.g3101sm.isChecked() ? "2"
                : "-1");

        json.put("g3101sdx", bi.g3101sdx.getText().toString());
        json.put("g3101smx", bi.g3101smx.getText().toString());
        json.put("g3102a", bi.g3102ay.isChecked() ? "1"
                : bi.g3102an.isChecked() ? "2"
                : "-1");

        json.put("g3102s", bi.g3102sy.isChecked() ? "1"
                : bi.g3102sn.isChecked() ? "2"
                : "-1");

        json.put("g3102so", bi.g3102sod.isChecked() ? "1"
                : bi.g3102som.isChecked() ? "2"
                : "-1");

        json.put("g3102sodx", bi.g3102sodx.getText().toString());
        json.put("g3102somx", bi.g3102somx.getText().toString());
        json.put("g3103", bi.g3103a.isChecked() ? "1"
                : bi.g3103b.isChecked() ? "2"
                : "-1");

        json.put("g3104a", bi.g3104ay.isChecked() ? "1"
                : bi.g3104an.isChecked() ? "2"
                : "-1");

        json.put("g3104s", bi.g3104sy.isChecked() ? "1"
                : bi.g3104sn.isChecked() ? "2"
                : "-1");

        json.put("g3104so", bi.g3104sod.isChecked() ? "1"
                : bi.g3104som.isChecked() ? "2"
                : "-1");

        json.put("g3104sodx", bi.g3104sodx.getText().toString());
        json.put("g3104somx", bi.g3104somx.getText().toString());
        json.put("g3105a", bi.g3105ay.isChecked() ? "1"
                : bi.g3105an.isChecked() ? "2"
                : "-1");

        json.put("g3105s", bi.g3105sy.isChecked() ? "1"
                : bi.g3105sn.isChecked() ? "2"
                : "-1");

        json.put("g3105so", bi.g3105sod.isChecked() ? "1"
                : bi.g3105som.isChecked() ? "2"
                : "-1");

        json.put("g3105sodx", bi.g3105sodx.getText().toString());
        json.put("g3105somx", bi.g3105somx.getText().toString());
        json.put("g3106a", bi.g3106ay.isChecked() ? "1"
                : bi.g3106an.isChecked() ? "2"
                : "-1");

        json.put("g3106s", bi.g3106sy.isChecked() ? "1"
                : bi.g3106sn.isChecked() ? "2"
                : "-1");

        json.put("g3106so", bi.g3106sod.isChecked() ? "1"
                : bi.g3106som.isChecked() ? "2"
                : "-1");

        json.put("g3106sodx", bi.g3106sodx.getText().toString());
        json.put("g3106somx", bi.g3106somx.getText().toString());
        json.put("g3107a", bi.g3107ay.isChecked() ? "1"
                : bi.g3107an.isChecked() ? "2"
                : "-1");

        json.put("g3107s", bi.g3107sy.isChecked() ? "1"
                : bi.g3107sn.isChecked() ? "2"
                : "-1");

        json.put("g3107so", bi.g3107sod.isChecked() ? "1"
                : bi.g3107som.isChecked() ? "2"
                : "-1");

        json.put("g3107sodx", bi.g3107sodx.getText().toString());
        json.put("g3107somx", bi.g3107somx.getText().toString());
        json.put("g3108a", bi.g3108ay.isChecked() ? "1"
                : bi.g3108an.isChecked() ? "2"
                : "-1");

        json.put("g3108s", bi.g3108sy.isChecked() ? "1"
                : bi.g3108sn.isChecked() ? "2"
                : "-1");

        json.put("g3108so", bi.g3108sod.isChecked() ? "1"
                : bi.g3108som.isChecked() ? "2"
                : "-1");

        json.put("g3108sodx", bi.g3108sodx.getText().toString());
        json.put("g3108somx", bi.g3108somx.getText().toString());
        json.put("g3109a", bi.g3109ay.isChecked() ? "1"
                : bi.g3109an.isChecked() ? "2"
                : "-1");

        json.put("g3109s", bi.g3109sy.isChecked() ? "1"
                : bi.g3109sn.isChecked() ? "2"
                : "-1");

        json.put("g3109so", bi.g3109sod.isChecked() ? "1"
                : bi.g3109som.isChecked() ? "2"
                : "-1");

        json.put("g3109sodx", bi.g3109sodx.getText().toString());
        json.put("g3109somx", bi.g3109somx.getText().toString());
        json.put("g3110a", bi.g3110ay.isChecked() ? "1"
                : bi.g3110an.isChecked() ? "2"
                : "-1");

        json.put("g3110s", bi.g3110sy.isChecked() ? "1"
                : bi.g3110sn.isChecked() ? "2"
                : "-1");

        json.put("g3110so", bi.g3110sod.isChecked() ? "1"
                : bi.g3110som.isChecked() ? "2"
                : "-1");

        json.put("g3110sodx", bi.g3110sodx.getText().toString());
        json.put("g3110somx", bi.g3110somx.getText().toString());
        json.put("g3111a", bi.g3111ay.isChecked() ? "1"
                : bi.g3111an.isChecked() ? "2"
                : "-1");

        json.put("g3111s", bi.g3111sy.isChecked() ? "1"
                : bi.g3111sn.isChecked() ? "2"
                : "-1");

        json.put("g3111so", bi.g3111sod.isChecked() ? "1"
                : bi.g3111som.isChecked() ? "2"
                : "-1");

        json.put("g3111sodx", bi.g3111sodx.getText().toString());
        json.put("g3111somx", bi.g3111somx.getText().toString());


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
            startActivity(new Intent(this, SectionG312Activity.class));
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
