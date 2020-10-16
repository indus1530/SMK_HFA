package edu.aku.hassannaqvi.smk_hfa_2020.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_hfa_2020.R;
import edu.aku.hassannaqvi.smk_hfa_2020.contracts.FormsContract;
import edu.aku.hassannaqvi.smk_hfa_2020.core.DatabaseHelper;
import edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp;
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivitySectionE103Binding;

import static edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp.fc;
import static edu.aku.hassannaqvi.smk_hfa_2020.utils.UtilKt.openSectionMainActivity;

public class SectionE103Activity extends AppCompatActivity {

    ActivitySectionE103Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e103);
        bi.setCallback(this);
        setupSkips();
    }

    private void setupSkips() {

    }

    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SE, fc.getsE());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
        JSONObject json = new JSONObject();

        json.put("e154aav", bi.e154aavy.isChecked() ? "1"
                : bi.e154aavn.isChecked() ? "2"
                :  "-1");

        json.put("e154af", bi.e154afy.isChecked() ? "1"
                : bi.e154afn.isChecked() ? "2"
                :  "-1");

        json.put("e154bav", bi.e154bavy.isChecked() ? "1"
                : bi.e154bavn.isChecked() ? "2"
                :  "-1");

        json.put("e154bf", bi.e154bfy.isChecked() ? "1"
                : bi.e154bfn.isChecked() ? "2"
                :  "-1");

        json.put("e154cav", bi.e154cavy.isChecked() ? "1"
                : bi.e154cavn.isChecked() ? "2"
                :  "-1");

        json.put("e154cf", bi.e154cfy.isChecked() ? "1"
                : bi.e154cfn.isChecked() ? "2"
                :  "-1");

        json.put("e154dav", bi.e154davy.isChecked() ? "1"
                : bi.e154davn.isChecked() ? "2"
                :  "-1");

        json.put("e154df", bi.e154dfy.isChecked() ? "1"
                : bi.e154dfn.isChecked() ? "2"
                :  "-1");

        json.put("e154eav", bi.e154eavy.isChecked() ? "1"
                : bi.e154eavn.isChecked() ? "2"
                :  "-1");

        json.put("e154ef", bi.e154efy.isChecked() ? "1"
                : bi.e154efn.isChecked() ? "2"
                :  "-1");

        json.put("e154fav", bi.e154favy.isChecked() ? "1"
                : bi.e154favn.isChecked() ? "2"
                :  "-1");

        json.put("e154ff", bi.e154ffy.isChecked() ? "1"
                : bi.e154ffn.isChecked() ? "2"
                :  "-1");

        json.put("e154gav", bi.e154gavy.isChecked() ? "1"
                : bi.e154gavn.isChecked() ? "2"
                :  "-1");

        json.put("e154gf", bi.e154gfy.isChecked() ? "1"
                : bi.e154gfn.isChecked() ? "2"
                :  "-1");

        json.put("e155aav", bi.e155aavy.isChecked() ? "1"
                : bi.e155aavn.isChecked() ? "2"
                :  "-1");

        json.put("e155af", bi.e155afy.isChecked() ? "1"
                : bi.e155afn.isChecked() ? "2"
                :  "-1");

        json.put("e155bav", bi.e155bavy.isChecked() ? "1"
                : bi.e155bavn.isChecked() ? "2"
                :  "-1");

        json.put("e155bf", bi.e155bfy.isChecked() ? "1"
                : bi.e155bfn.isChecked() ? "2"
                :  "-1");

        json.put("e155cav", bi.e155cavy.isChecked() ? "1"
                : bi.e155cavn.isChecked() ? "2"
                :  "-1");

        json.put("e155cf", bi.e155cfy.isChecked() ? "1"
                : bi.e155cfn.isChecked() ? "2"
                :  "-1");

        json.put("e155dav", bi.e155davy.isChecked() ? "1"
                : bi.e155davn.isChecked() ? "2"
                :  "-1");

        json.put("e155df", bi.e155dfy.isChecked() ? "1"
                : bi.e155dfn.isChecked() ? "2"
                :  "-1");

        json.put("e156aav", bi.e156aavy.isChecked() ? "1"
                : bi.e156aavn.isChecked() ? "2"
                :  "-1");

        json.put("e156af", bi.e156afy.isChecked() ? "1"
                : bi.e156afn.isChecked() ? "2"
                :  "-1");

        json.put("e156bav", bi.e156bavy.isChecked() ? "1"
                : bi.e156bavn.isChecked() ? "2"
                :  "-1");

        json.put("e156bf", bi.e156bfy.isChecked() ? "1"
                : bi.e156bfn.isChecked() ? "2"
                :  "-1");

        json.put("e156cav", bi.e156cavy.isChecked() ? "1"
                : bi.e156cavn.isChecked() ? "2"
                :  "-1");

        json.put("e156cf", bi.e156cfy.isChecked() ? "1"
                : bi.e156cfn.isChecked() ? "2"
                :  "-1");

        json.put("e156dav", bi.e156davy.isChecked() ? "1"
                : bi.e156davn.isChecked() ? "2"
                :  "-1");

        json.put("e156df", bi.e156dfy.isChecked() ? "1"
                : bi.e156dfn.isChecked() ? "2"
                :  "-1");

        json.put("e156eav", bi.e156eavy.isChecked() ? "1"
                : bi.e156eavn.isChecked() ? "2"
                :  "-1");

        json.put("e156ef", bi.e156efy.isChecked() ? "1"
                : bi.e156efn.isChecked() ? "2"
                :  "-1");

        json.put("e156fav", bi.e156favy.isChecked() ? "1"
                : bi.e156favn.isChecked() ? "2"
                :  "-1");

        json.put("e156ff", bi.e156ffy.isChecked() ? "1"
                : bi.e156ffn.isChecked() ? "2"
                :  "-1");

        json.put("e156gav", bi.e156gavy.isChecked() ? "1"
                : bi.e156gavn.isChecked() ? "2"
                :  "-1");

        json.put("e156gf", bi.e156gfy.isChecked() ? "1"
                : bi.e156gfn.isChecked() ? "2"
                :  "-1");

        json.put("e156hav", bi.e156havy.isChecked() ? "1"
                : bi.e156havn.isChecked() ? "2"
                :  "-1");

        json.put("e156hf", bi.e156hfy.isChecked() ? "1"
                : bi.e156hfn.isChecked() ? "2"
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
            startActivity(new Intent(this, SectionE2Activity.class));
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
