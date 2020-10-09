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
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionG321Binding;
import edu.aku.hassannaqvi.smk_hfa_2020.utils.JSONUtils;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;


public class SectionG321Activity extends AppCompatActivity {

    ActivitySectionG321Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g321);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        bi.g040210s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040210sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040210so);
            }
        }));

        bi.g040220s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040220sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040220so);
            }
        }));

        bi.g040230s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040230sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040230so);
            }
        }));

        bi.g040240s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040240sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040240so);
            }
        }));

        bi.g040250s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040250sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040250so);
            }
        }));

        bi.g040260s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040260sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040260so);
            }
        }));

        bi.g040270s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040270sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040270so);
            }
        }));

        bi.g040280s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040280sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040280so);
            }
        }));

        bi.g040290s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g040290sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg040290so);
            }
        }));

        bi.g0402100s.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.g0402100sn.getId()) {
                Clear.clearAllFields(bi.fldGrpCVg0402100so);
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
        json.put("g3201s", bi.g3201sy.isChecked() ? "1"
                : bi.g3201sn.isChecked() ? "2"
                : "-1");

        json.put("g3201so", bi.g3201sod.isChecked() ? "1"
                : bi.g3201som.isChecked() ? "2"
                : "-1");

        json.put("g3201sodx", bi.g3201sodx.getText().toString());
        json.put("g3201somx", bi.g3201somx.getText().toString());
        json.put("g3201p", bi.g3201py.isChecked() ? "1"
                : bi.g3201pn.isChecked() ? "2"
                : "-1");

        json.put("g3202a", bi.g3202ay.isChecked() ? "1"
                : bi.g3202an.isChecked() ? "2"
                : "-1");

        json.put("g3202s", bi.g3202sy.isChecked() ? "1"
                : bi.g3202sn.isChecked() ? "2"
                : "-1");

        json.put("g3202so", bi.g3202sod.isChecked() ? "1"
                : bi.g3202som.isChecked() ? "2"
                : "-1");

        json.put("g3202sodx", bi.g3202sodx.getText().toString());
        json.put("g3202somx", bi.g3202somx.getText().toString());
        json.put("g3202p", bi.g3202py.isChecked() ? "1"
                : bi.g3202pn.isChecked() ? "2"
                : "-1");

        json.put("g3203a", bi.g3203ay.isChecked() ? "1"
                : bi.g3203an.isChecked() ? "2"
                : "-1");

        json.put("g3203s", bi.g3203sy.isChecked() ? "1"
                : bi.g3203sn.isChecked() ? "2"
                : "-1");

        json.put("g3203so", bi.g3203sod.isChecked() ? "1"
                : bi.g3203som.isChecked() ? "2"
                : "-1");

        json.put("g3203sodx", bi.g3203sodx.getText().toString());
        json.put("g3203somx", bi.g3203somx.getText().toString());
        json.put("g3203p", bi.g3203py.isChecked() ? "1"
                : bi.g3203pn.isChecked() ? "2"
                : "-1");

        json.put("g3204a", bi.g3204ay.isChecked() ? "1"
                : bi.g3204an.isChecked() ? "2"
                : "-1");

        json.put("g3204s", bi.g3204sy.isChecked() ? "1"
                : bi.g3204sn.isChecked() ? "2"
                : "-1");

        json.put("g3204so", bi.g3204sod.isChecked() ? "1"
                : bi.g3204som.isChecked() ? "2"
                : "-1");

        json.put("g3204sodx", bi.g3204sodx.getText().toString());
        json.put("g3204somx", bi.g3204somx.getText().toString());
        json.put("g3204p", bi.g3204py.isChecked() ? "1"
                : bi.g3204pn.isChecked() ? "2"
                : "-1");

        json.put("g3205a", bi.g3205ay.isChecked() ? "1"
                : bi.g3205an.isChecked() ? "2"
                : "-1");

        json.put("g3205s", bi.g3205sy.isChecked() ? "1"
                : bi.g3205sn.isChecked() ? "2"
                : "-1");

        json.put("g3205so", bi.g3205sod.isChecked() ? "1"
                : bi.g3205som.isChecked() ? "2"
                : "-1");

        json.put("g3205sodx", bi.g3205sodx.getText().toString());
        json.put("g3205somx", bi.g3205somx.getText().toString());
        json.put("g3205p", bi.g3205py.isChecked() ? "1"
                : bi.g3205pn.isChecked() ? "2"
                : "-1");

        json.put("g3206a", bi.g3206ay.isChecked() ? "1"
                : bi.g3206an.isChecked() ? "2"
                : "-1");

        json.put("g3206s", bi.g3206sy.isChecked() ? "1"
                : bi.g3206sn.isChecked() ? "2"
                : "-1");

        json.put("g3206so", bi.g3206sod.isChecked() ? "1"
                : bi.g3206som.isChecked() ? "2"
                : "-1");

        json.put("g3206sodx", bi.g3206sodx.getText().toString());
        json.put("g3206somx", bi.g3206somx.getText().toString());
        json.put("g3206p", bi.g3206py.isChecked() ? "1"
                : bi.g3206pn.isChecked() ? "2"
                : "-1");

        json.put("g3207a", bi.g3207ay.isChecked() ? "1"
                : bi.g3207an.isChecked() ? "2"
                : "-1");

        json.put("g3207s", bi.g3207sy.isChecked() ? "1"
                : bi.g3207sn.isChecked() ? "2"
                : "-1");

        json.put("g3207so", bi.g3207sod.isChecked() ? "1"
                : bi.g3207som.isChecked() ? "2"
                : "-1");

        json.put("g3207sodx", bi.g3207sodx.getText().toString());
        json.put("g3207somx", bi.g3207somx.getText().toString());
        json.put("g3207p", bi.g3207py.isChecked() ? "1"
                : bi.g3207pn.isChecked() ? "2"
                : "-1");

        json.put("g3208a", bi.g3208ay.isChecked() ? "1"
                : bi.g3208an.isChecked() ? "2"
                : "-1");

        json.put("g3208s", bi.g3208sy.isChecked() ? "1"
                : bi.g3208sn.isChecked() ? "2"
                : "-1");

        json.put("g3208so", bi.g3208sod.isChecked() ? "1"
                : bi.g3208som.isChecked() ? "2"
                : "-1");

        json.put("g3208sodx", bi.g3208sodx.getText().toString());
        json.put("g3208somx", bi.g3208somx.getText().toString());
        json.put("g3208p", bi.g3208py.isChecked() ? "1"
                : bi.g3208pn.isChecked() ? "2"
                : "-1");

        json.put("g3209a", bi.g3209ay.isChecked() ? "1"
                : bi.g3209an.isChecked() ? "2"
                : "-1");

        json.put("g3209s", bi.g3209sy.isChecked() ? "1"
                : bi.g3209sn.isChecked() ? "2"
                : "-1");

        json.put("g3209so", bi.g3209sod.isChecked() ? "1"
                : bi.g3209som.isChecked() ? "2"
                : "-1");

        json.put("g3209sodx", bi.g3209sodx.getText().toString());
        json.put("g3209somx", bi.g3209somx.getText().toString());
        json.put("g3209p", bi.g3209py.isChecked() ? "1"
                : bi.g3209pn.isChecked() ? "2"
                : "-1");


        json.put("g3210a", bi.g3210ay.isChecked() ? "1"
                : bi.g3210an.isChecked() ? "2"
                : "-1");

        json.put("g3210s", bi.g3210sy.isChecked() ? "1"
                : bi.g3210sn.isChecked() ? "2"
                : "-1");

        json.put("g3210so", bi.g3210sod.isChecked() ? "1"
                : bi.g3210som.isChecked() ? "2"
                : "-1");

        json.put("g3210sodx", bi.g3210sodx.getText().toString());
        json.put("g3210somx", bi.g3210somx.getText().toString());
        json.put("g3210p", bi.g3210py.isChecked() ? "1"
                : bi.g3210pn.isChecked() ? "2"
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
            startActivity(new Intent(this, SectionG322Activity.class));
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
