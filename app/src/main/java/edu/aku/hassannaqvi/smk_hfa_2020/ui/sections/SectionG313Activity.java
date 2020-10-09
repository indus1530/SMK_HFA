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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG313Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionG313Activity extends AppCompatActivity {

    ActivitySectionG313Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g313);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g0401200s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401200sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401200so);
            }
        }));

        bi.g0401210s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401210sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401210so);
            }
        }));


        bi.g0401220s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401220sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401220so);
            }
        }));


        bi.g0401230s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401230sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401230so);
            }
        }));


        bi.g0401240s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401240sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401240so);
            }
        }));


        bi.g0401250s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401250sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401250so);
            }
        }));


        bi.g0401260s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401260sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401260so);
            }
        }));


        bi.g0401270s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401270sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401270so);
            }
        }));

        bi.g0401280s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401280sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401280so);
            }
        }));

        bi.g0401290s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401290sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401290so);
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


        json.put("g3120a", bi.g3120ay.isChecked() ? "1"
                : bi.g3120an.isChecked() ? "2"
                : "-1");

        json.put("g3120s", bi.g3120sy.isChecked() ? "1"
                : bi.g3120sn.isChecked() ? "2"
                : "-1");

        json.put("g3120so", bi.g3120sod.isChecked() ? "1"
                : bi.g3120som.isChecked() ? "2"
                : "-1");

        json.put("g3120sodx", bi.g3120sodx.getText().toString());
        json.put("g3120somx", bi.g3120somx.getText().toString());
        json.put("g3121a", bi.g3121ay.isChecked() ? "1"
                : bi.g3121an.isChecked() ? "2"
                : "-1");

        json.put("g3121s", bi.g3121sy.isChecked() ? "1"
                : bi.g3121sn.isChecked() ? "2"
                : "-1");

        json.put("g3121so", bi.g3121sod.isChecked() ? "1"
                : bi.g3121som.isChecked() ? "2"
                : "-1");

        json.put("g3121sodx", bi.g3121sodx.getText().toString());
        json.put("g3121somx", bi.g3121somx.getText().toString());
        json.put("g3122a", bi.g3122ay.isChecked() ? "1"
                : bi.g3122an.isChecked() ? "2"
                : "-1");

        json.put("g3122s", bi.g3122sy.isChecked() ? "1"
                : bi.g3122sn.isChecked() ? "2"
                : "-1");

        json.put("g3122so", bi.g3122sod.isChecked() ? "1"
                : bi.g3122som.isChecked() ? "2"
                : "-1");

        json.put("g3122sodx", bi.g3122sodx.getText().toString());
        json.put("g3122somx", bi.g3122somx.getText().toString());
        json.put("g3123a", bi.g3123ay.isChecked() ? "1"
                : bi.g3123an.isChecked() ? "2"
                : "-1");

        json.put("g3123s", bi.g3123sy.isChecked() ? "1"
                : bi.g3123sn.isChecked() ? "2"
                : "-1");

        json.put("g3123so", bi.g3123sod.isChecked() ? "1"
                : bi.g3123som.isChecked() ? "2"
                : "-1");

        json.put("g3123sodx", bi.g3123sodx.getText().toString());
        json.put("g3123somx", bi.g3123somx.getText().toString());
        json.put("g3124a", bi.g3124ay.isChecked() ? "1"
                : bi.g3124an.isChecked() ? "2"
                : "-1");

        json.put("g3124s", bi.g3124sy.isChecked() ? "1"
                : bi.g3124sn.isChecked() ? "2"
                : "-1");

        json.put("g3124so", bi.g3124sod.isChecked() ? "1"
                : bi.g3124som.isChecked() ? "2"
                : "-1");

        json.put("g3124sodx", bi.g3124sodx.getText().toString());
        json.put("g3124somx", bi.g3124somx.getText().toString());
        json.put("g3125a", bi.g3125ay.isChecked() ? "1"
                : bi.g3125an.isChecked() ? "2"
                : "-1");

        json.put("g3125s", bi.g3125sy.isChecked() ? "1"
                : bi.g3125sn.isChecked() ? "2"
                : "-1");

        json.put("g3125so", bi.g3125sod.isChecked() ? "1"
                : bi.g3125som.isChecked() ? "2"
                : "-1");

        json.put("g3125sodx", bi.g3125sodx.getText().toString());
        json.put("g3125somx", bi.g3125somx.getText().toString());
        json.put("g3126a", bi.g3126ay.isChecked() ? "1"
                : bi.g3126an.isChecked() ? "2"
                : "-1");

        json.put("g3126s", bi.g3126sy.isChecked() ? "1"
                : bi.g3126sn.isChecked() ? "2"
                : "-1");

        json.put("g3126so", bi.g3126sod.isChecked() ? "1"
                : bi.g3126som.isChecked() ? "2"
                : "-1");

        json.put("g3126sodx", bi.g3126sodx.getText().toString());
        json.put("g3126somx", bi.g3126somx.getText().toString());
        json.put("g3127a", bi.g3127ay.isChecked() ? "1"
                : bi.g3127an.isChecked() ? "2"
                : "-1");

        json.put("g3127s", bi.g3127sy.isChecked() ? "1"
                : bi.g3127sn.isChecked() ? "2"
                : "-1");

        json.put("g3127so", bi.g3127sod.isChecked() ? "1"
                : bi.g3127som.isChecked() ? "2"
                : "-1");

        json.put("g3127sodx", bi.g3127sodx.getText().toString());
        json.put("g3127somx", bi.g3127somx.getText().toString());
        json.put("g3128a", bi.g3128ay.isChecked() ? "1"
                : bi.g3128an.isChecked() ? "2"
                : "-1");

        json.put("g3128s", bi.g3128sy.isChecked() ? "1"
                : bi.g3128sn.isChecked() ? "2"
                : "-1");

        json.put("g3128so", bi.g3128sod.isChecked() ? "1"
                : bi.g3128som.isChecked() ? "2"
                : "-1");

        json.put("g3128sodx", bi.g3128sodx.getText().toString());
        json.put("g3128somx", bi.g3128somx.getText().toString());
        json.put("g3129a", bi.g3129ay.isChecked() ? "1"
                : bi.g3129an.isChecked() ? "2"
                : "-1");

        json.put("g3129s", bi.g3129sy.isChecked() ? "1"
                : bi.g3129sn.isChecked() ? "2"
                : "-1");

        json.put("g3129so", bi.g3129sod.isChecked() ? "1"
                : bi.g3129som.isChecked() ? "2"
                : "-1");

        json.put("g3129sodx", bi.g3129sodx.getText().toString());
        json.put("g3129somx", bi.g3129somx.getText().toString());


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
            startActivity(new Intent(this, SectionG314Activity.class));
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
