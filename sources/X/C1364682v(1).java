package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.barcelona.R;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.business.instantexperiences.ui.InstantExperiencesSaveAutofillDialog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.82v  reason: invalid class name and case insensitive filesystem */
public final class C1364682v implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ IGInstantExperiencesParameters A01;
    public final /* synthetic */ AnonymousClass7pZ A02;
    public final /* synthetic */ List A03;

    public C1364682v(View view, IGInstantExperiencesParameters iGInstantExperiencesParameters, AnonymousClass7pZ r3, List list) {
        this.A02 = r3;
        this.A00 = view;
        this.A03 = list;
        this.A01 = iGInstantExperiencesParameters;
    }

    public final void run() {
        AnonymousClass7pZ r6 = this.A02;
        if (r6.A00 == null) {
            ViewStub viewStub = (ViewStub) this.A00.requireViewById(R.id.instant_experiences_save_autofill_dialog);
            viewStub.setLayoutResource(R.layout.instant_experiences_autofill_save_dialog);
            r6.A00 = (InstantExperiencesSaveAutofillDialog) viewStub.inflate();
        }
        List<FbAutofillData> list = this.A03;
        HashSet A0u = C18200wM.A0u();
        for (FbAutofillData ASM : list) {
            A0u.addAll(ASM.ASM().keySet());
        }
        Object[] A1b = C86144wL.A1b(A0u);
        Arrays.sort(A1b);
        String join = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A1b);
        InstantExperiencesSaveAutofillDialog instantExperiencesSaveAutofillDialog = r6.A00;
        C107966hb r3 = new C107966hb(this, join);
        ArrayList A0t = C18200wM.A0t(list);
        for (FbAutofillData fbAutofillData : list) {
            A0t.add(((BrowserExtensionsAutofillData) fbAutofillData).A01());
        }
        instantExperiencesSaveAutofillDialog.setDetailItems(A0t);
        instantExperiencesSaveAutofillDialog.A02 = r3;
        r6.A02.A00(true);
        AnonymousClass7H6.A01(r6.A03).A03(this.A01, new C1376289i(this, join));
    }
}
