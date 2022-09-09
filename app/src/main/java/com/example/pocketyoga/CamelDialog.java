package com.example.pocketyoga;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class CamelDialog extends AppCompatDialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Note")
                .setMessage("BENEFITS:\n\n- Reduces fat on thighs.\n" +
                        "- Opens up the hips, stretching deep hip flexors.\n" +
                        "- Stretches and strengthens the shoulders and back.\n" +
                        "- Expands the abdominal region, improving digestion and elimination.\n" +
                        "- Reduces dandruff.\n" +
                        "- Opens the chest, improving respiration.\n" +
                        "- Loosens up the vertebrae.\n" +
                        "- Relieves lower back pain.\n" +
                        "- Helpful in irregular periods.\n\nPRECAUTIONS:\n\n- Breath normally throughout the practice.\n" +
                        "- People suffering from high or low blood pressure should avoid practicing this asana.\n" +
                        "- People suffering from insomnia should avoid this asana.\n" +
                        "- Should be avoided by people having any back injury or pain in the neck.\n")
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

