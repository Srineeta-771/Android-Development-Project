package com.example.pocketyoga;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class PlowDialog extends AppCompatDialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Note")
                .setMessage("BENEFITS:\n\n- Improves blood pressure, and lowers blood sugar levels.\n" +
                        "- It helps prevent and relieve tightness in your neck, shoulders, and back. The pose also strengthens your shoulders, arms, and legs.\n" +
                        "- Enhances flexibility, which improves muscle and joint mobility.\n" +
                        "- It also makes your spine more supple, which may help ease muscle tension and improve posture. \n\nPRECAUTIONS:\n\n- Avoid practicing in case you suffer from any of this condition: Slipped disc, severe pain or injury in back or neck, hernia, sciatica, enlarged thyroid, spleen or liver, cervical problems, heart conditions or frequent headaches.\n" +
                        "- Not be practiced during pregnancy and while menstruation.\n")
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


