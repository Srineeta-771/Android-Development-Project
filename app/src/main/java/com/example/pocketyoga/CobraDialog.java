package com.example.pocketyoga;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class CobraDialog extends AppCompatDialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Note")
                .setMessage("BENEFITS:\n\n- Strengthens the spine.\n" +
                        "- Stretches chest and lungs, shoulders, and abdomen.\n" +
                        "- Tones the buttocks.\n" +
                        "- Stimulates abdominal organs.\n" +
                        "- Helps relieve stress and fatigue.\n" +
                        "- Opens the heart and lungs.\n" +
                        "- Soothes sciatica.\n" +
                        "- Therapeutic for asthma.\n\nPRECAUTIONS:\n\n- Don't keep your body stiff.\n" +
                        "- Pregnant women should avoid doing the pose.\n" +
                        "- Don't put too much pressure on yourself when practising it.\n" +
                        "- Keep your buttocks loose during Cobra posture as they tend to tense up naturally.\n")
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

