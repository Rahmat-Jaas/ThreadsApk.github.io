package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C05470Tw;
import X.C09120et;
import X.C14030oh;
import X.C18210wN;
import X.C18250wR;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.Switch;

public final class PublicDeveloperOptions$showInstacrashDialog$1 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ NumberPicker $crashTimePicker;
    public final /* synthetic */ String[] $crashTimePickerValuesSeconds;
    public final /* synthetic */ C09120et $devPreferences;
    public final /* synthetic */ Dialog $dialog;
    public final /* synthetic */ Switch $endpointSwitch;

    public PublicDeveloperOptions$showInstacrashDialog$1(Dialog dialog, C09120et r2, String[] strArr, NumberPicker numberPicker, Switch switchR, Context context) {
        this.$dialog = dialog;
        this.$devPreferences = r2;
        this.$crashTimePickerValuesSeconds = strArr;
        this.$crashTimePicker = numberPicker;
        this.$endpointSwitch = switchR;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(165716514);
        this.$dialog.dismiss();
        C09120et r4 = this.$devPreferences;
        AnonymousClass0wJ.A11(r4.A00.edit(), "instacrash_loop_test_crash_time", Integer.parseInt(this.$crashTimePickerValuesSeconds[this.$crashTimePicker.getValue()]));
        C18210wN.A1I(this.$devPreferences.A1G, Integer.MAX_VALUE);
        C09120et r2 = this.$devPreferences;
        AnonymousClass0wJ.A1L(r2.A1H, this.$endpointSwitch.isChecked());
        C05470Tw.A01(this.$context, true);
        RuntimeException A0V = C18250wR.A0V("INSTACRASH TESTING");
        C14030oh.A0C(-853078776, A05);
        throw A0V;
    }
}
