package com.example.pocketyoga;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class BridgeDialog extends AppCompatDialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Note")
                .setMessage("BENEFITS:\n\n- Strengthens back, glutes, legs and ankles.\n" +
                        "- Opens chest, heart and hip flexos.\n" +
                        "- Stretches the chest, neck, shoulders and spine.\n" +
                        "- Calms the body, alleviates stress and mild depression.\n" +
                        "- Stimulates organs of the abdomen, lungs and thyroid.\n" +
                        "- Rejuvenates tired legs.\n" +
                        "- Improves digestion.\n\nPRECAUTIONS:\n\n- If you are suffering from neck or knee pain, you should avoid this asana.\n" +
                        "- This asana should not be done by people who have a neck, back or shoulder injury.\n" +
                        "- Pregnant women can do this asana but practice it only under the guidance of well-trained personnel.\n")
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

