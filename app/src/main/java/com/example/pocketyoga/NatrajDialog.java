package com.example.pocketyoga;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class NatrajDialog extends AppCompatDialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Note")
                .setMessage("BENEFITS:\n\n- Improves digestion, strengthens the spine, and develops greater flexibility in the legs. \n" +
                        "- This asana is beneficial for health as it calms the mind.\n\n\nPRECAUTIONS:\n\n- Avoid practicing if you suffer from any of this condition: Severe back pain, heart problems, high blood pressure, duodenal or peptic ulcers, hernia, colitis or vertigo.\n" +
                        "- Neither overstretch the body nor hold the pose for too long.\n")
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
