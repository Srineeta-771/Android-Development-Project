package com.example.pocketyoga;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class RevprayerDialog extends AppCompatDialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Note")
                .setMessage("BENEFITS:\n\n- It stretches the shoulder, upper back, joints, and pectoral muscles.\n" +
                        "- It has posture correction ability if performed frequently.\n" +
                        "- Helps you breathe better by opening chest muscles.\n" +
                        "- Releases any built-up stress in muscles around your neck, shoulders and arms.\n\nPRECAUTIONS:\n\n- Do not strain yourself.\n")
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

