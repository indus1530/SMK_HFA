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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG314Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionG314Activity extends AppCompatActivity {

    ActivitySectionG314Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g314);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g0401300s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401300sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401300so);
            }
        }));

        bi.g0401310s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401310sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401310so);
            }
        }));

        bi.g0401320s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401320sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401320so);
            }
        }));

        bi.g0401330s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401330sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401330so);
            }
        }));

        bi.g0401340s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401340sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401340so);
            }
        }));

        bi.g0401350s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401350sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401350so);
            }
        }));

        bi.g0401360s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401360sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401360so);
            }
        }));

        bi.g0401370s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401370sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401370so);
            }
        }));

        bi.g0401380s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401380sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401380so);
            }
        }));

        bi.g0401390s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0401390sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0401390so);
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

        json.put("g3130a", bi.g3130ay.isChecked() ? "1"
                : bi.g3130an.isChecked() ? "2"
                : "-1");
        json.put("g3130s", bi.g3130sy.isChecked() ? "1"
                : bi.g3130sn.isChecked() ? "2"
                : "-1");

        json.put("g3130so", bi.g3130sod.isChecked() ? "1"
                : bi.g3130som.isChecked() ? "2"
                : "-1");

        json.put("g3130sodx", bi.g3130sodx.getText().toString());
        json.put("g3130somx", bi.g3130somx.getText().toString());
        json.put("g3131a", bi.g3131ay.isChecked() ? "1"
                : bi.g3131an.isChecked() ? "2"
                : "-1");

        json.put("g3131s", bi.g3131sy.isChecked() ? "1"
                : bi.g3131sn.isChecked() ? "2"
                : "-1");

        json.put("g3131so", bi.g3131sod.isChecked() ? "1"
                : bi.g3131som.isChecked() ? "2"
                : "-1");

        json.put("g3131sodx", bi.g3131sodx.getText().toString());
        json.put("g3131somx", bi.g3131somx.getText().toString());
        json.put("g3132a", bi.g3132ay.isChecked() ? "1"
                : bi.g3132an.isChecked() ? "2"
                : "-1");

        json.put("g3132s", bi.g3132sy.isChecked() ? "1"
                : bi.g3132sn.isChecked() ? "2"
                : "-1");

        json.put("g3132so", bi.g3132sod.isChecked() ? "1"
                : bi.g3132som.isChecked() ? "2"
                : "-1");

        json.put("g3132sodx", bi.g3132sodx.getText().toString());
        json.put("g3132somx", bi.g3132somx.getText().toString());
        json.put("g3133a", bi.g3133ay.isChecked() ? "1"
                : bi.g3133an.isChecked() ? "2"
                : "-1");

        json.put("g3133s", bi.g3133sy.isChecked() ? "1"
                : bi.g3133sn.isChecked() ? "2"
                : "-1");

        json.put("g3133so", bi.g3133sod.isChecked() ? "1"
                : bi.g3133som.isChecked() ? "2"
                : "-1");

        json.put("g3133sodx", bi.g3133sodx.getText().toString());
        json.put("g3133somx", bi.g3133somx.getText().toString());
        json.put("g3134a", bi.g3134ay.isChecked() ? "1"
                : bi.g3134an.isChecked() ? "2"
                : "-1");

        json.put("g3134s", bi.g3134sy.isChecked() ? "1"
                : bi.g3134sn.isChecked() ? "2"
                : "-1");

        json.put("g3134so", bi.g3134sod.isChecked() ? "1"
                : bi.g3134som.isChecked() ? "2"
                : "-1");

        json.put("g3134sodx", bi.g3134sodx.getText().toString());
        json.put("g3134somx", bi.g3134somx.getText().toString());
        json.put("g3135a", bi.g3135ay.isChecked() ? "1"
                : bi.g3135an.isChecked() ? "2"
                : "-1");

        json.put("g3135s", bi.g3135sy.isChecked() ? "1"
                : bi.g3135sn.isChecked() ? "2"
                : "-1");

        json.put("g3135so", bi.g3135sod.isChecked() ? "1"
                : bi.g3135som.isChecked() ? "2"
                : "-1");

        json.put("g3135sodx", bi.g3135sodx.getText().toString());
        json.put("g3135somx", bi.g3135somx.getText().toString());
        json.put("g3136a", bi.g3136ay.isChecked() ? "1"
                : bi.g3136an.isChecked() ? "2"
                : "-1");

        json.put("g3136s", bi.g3136sy.isChecked() ? "1"
                : bi.g3136sn.isChecked() ? "2"
                : "-1");

        json.put("g3136so", bi.g3136sod.isChecked() ? "1"
                : bi.g3136som.isChecked() ? "2"
                : "-1");

        json.put("g3136sodx", bi.g3136sodx.getText().toString());
        json.put("g3136somx", bi.g3136somx.getText().toString());
        json.put("g3137a", bi.g3137ay.isChecked() ? "1"
                : bi.g3137an.isChecked() ? "2"
                : "-1");

        json.put("g3137s", bi.g3137sy.isChecked() ? "1"
                : bi.g3137sn.isChecked() ? "2"
                : "-1");

        json.put("g3137so", bi.g3137sod.isChecked() ? "1"
                : bi.g3137som.isChecked() ? "2"
                : "-1");

        json.put("g3137sodx", bi.g3137sodx.getText().toString());
        json.put("g3137somx", bi.g3137somx.getText().toString());
        json.put("g3138a", bi.g3138ay.isChecked() ? "1"
                : bi.g3138an.isChecked() ? "2"
                : "-1");

        json.put("g3138s", bi.g3138sy.isChecked() ? "1"
                : bi.g3138sn.isChecked() ? "2"
                : "-1");

        json.put("g3138so", bi.g3138sod.isChecked() ? "1"
                : bi.g3138som.isChecked() ? "2"
                : "-1");

        json.put("g3138sodx", bi.g3138sodx.getText().toString());
        json.put("g3138somx", bi.g3138somx.getText().toString());
        json.put("g3139a", bi.g3139ay.isChecked() ? "1"
                : bi.g3139an.isChecked() ? "2"
                : "-1");

        json.put("g3139s", bi.g3139sy.isChecked() ? "1"
                : bi.g3139sn.isChecked() ? "2"
                : "-1");

        json.put("g3139so", bi.g3139sod.isChecked() ? "1"
                : bi.g3139som.isChecked() ? "2"
                : "-1");

        json.put("g3139sodx", bi.g3139sodx.getText().toString());
        json.put("g3139somx", bi.g3139somx.getText().toString());


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
            startActivity(new Intent(this, SectionG315Activity.class));
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
