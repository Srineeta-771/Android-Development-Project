package com.example.pocketyoga;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class SirsasanDialog extends AppCompatDialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Note")
                .setMessage("BENEFITS:\n\n-Relieves Stress\n-Increases Focus\n-Improves Blood Flow To The Eyes\n-Increases Blood Flow To The Head And Scalp\n-Strengthens Shoulders And Arms\n-Improves Digestion\n\nPRECAUTIONS:\n\n-Don't move too fast\n-Distribute your weight wisely\n-Not to be performed by pregnant women\n-Not to be performed during menstrual cycle\n")
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
