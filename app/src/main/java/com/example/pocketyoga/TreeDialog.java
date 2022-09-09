package com.example.pocketyoga;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class TreeDialog
        extends AppCompatDialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Note")
                .setMessage("BENEFITS:\n\n- Help stretch and strengthen the ligaments and tendons in your feet.\n" +
                        "- Improves balance. Tree pose requires proper weight distribution and posture, which can help provide stability to your groin, thighs, hips, and pelvis.\n" +
                        "- Strengthens your core.\n\nPRECAUTIONS:\n\n- Do not practice if you have insomnia.\n" +
                        "- If your blood pressure is high then do not raise your arms upwards.\n" +
                        "- People suffering from severe leg or thigh injury should avoid practicing.\n")
                .setPositiveButton("Noted!", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {

                    }
                });
        return builder.create();
    }
}
