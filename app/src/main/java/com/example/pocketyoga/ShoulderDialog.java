package com.example.pocketyoga;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class ShoulderDialog extends AppCompatDialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Note")
                .setMessage("BENEFITS:\n\n- Stretches the shoulders and neck.\n" +
                        "- Cooling, calming, quietens the nervous system.\n" +
                        "- Reduces fluid retention in the legs and feet Regulates and normalises elimination.\n" +
                        "- The thyroid and para-thyroid are nourished with blood.\n" +
                        "- Reduces fatigue and can help you to improve your sleep.\n" +
                        "- Improves digestion.\n\n\nPRECAUTIONS:\n\n- People with neck injuries or conditions should avoid doing this pose. \n" +
                        "- Those with high blood pressure, glaucoma, retinal problems are not recommended to do poses that require their heads to be lower than your heart. \n" +
                        "- If you experience any pain while doing Shoulder stand, immediately stop and exit the pose.\n\n")
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
