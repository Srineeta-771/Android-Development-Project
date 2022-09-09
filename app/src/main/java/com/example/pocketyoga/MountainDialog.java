package com.example.pocketyoga;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;
public class MountainDialog extends AppCompatDialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Note")
                .setMessage("BENEFITS:\n\n- Promoting good posture\n" +
                        "- Improving flexibility\n" +
                        "- Boosting your self-esteem\n" +
                        "- Strengthening your legs and abs\n" +
                        "- Supporting a healthy gut\n" +
                        "- Developing better balance\n" +
                        "- Offering a beginner-friendly yoga pose\n\nPRECAUTIONS:\n\n- Do not practice it if you suffer from Insomnia.\n" +
                        "- People with headache problems should not practice mountain pose.\n" +
                        "- Don't do it if your blood pressure is low.\n" +
                        "- Not be done by pregnant women.\n" +
                        "- Do not over-restrain yourself\n")
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
