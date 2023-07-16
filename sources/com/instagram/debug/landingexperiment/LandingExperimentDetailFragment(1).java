package com.instagram.debug.landingexperiment;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass34V;
import X.AnonymousClass3R8;
import X.AnonymousClass3YK;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C23411dm;
import X.C60913Rb;
import X.C61163Sd;
import X.C63293hC;
import X.C63613hu;
import X.C80644m9;
import X.C82034oy;
import android.os.Bundle;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class LandingExperimentDetailFragment extends C23411dm implements C82034oy {
    public final String SELECTED_LANDING_EXPERIMENT = "selected_landing_experiment";
    public AnonymousClass3YK selectedExperiment;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A08(r2, "Landing Experiment Details");
    }

    public String getModuleName() {
        return "landing_experiment_detail";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        setItems(getMenuItems());
    }

    private final List getGroupNamesMenuItems() {
        AnonymousClass3YK r0 = this.selectedExperiment;
        if (r0 != null) {
            AnonymousClass34V r1 = r0.A07;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            String str = AnonymousClass3YK.A00(r0).A01;
            List list = r1.A00;
            int size = list.size();
            int i = 0;
            while (i < size) {
                Locale locale = Locale.ENGLISH;
                String A00 = C61163Sd.A00(list, i);
                double d = (double) 100;
                Double valueOf = Double.valueOf(((C61163Sd) list.get(i)).A00 * d);
                AnonymousClass3YK r02 = this.selectedExperiment;
                if (r02 != null) {
                    String format = String.format(locale, "%s - [%2.2f%%/%2.2f%%]", new Object[]{A00, valueOf, Double.valueOf(r02.A06 * ((C61163Sd) list.get(i)).A00 * d)});
                    C04220Ms.A06(format);
                    AnonymousClass4MA A01 = AnonymousClass4MA.A01(new LandingExperimentDetailFragment$getGroupNamesMenuItems$groupNameMenuItem$1(this, i), format);
                    if (C04220Ms.A0I(str, C61163Sd.A00(list, i))) {
                        A01.A00 = R.drawable.instagram_check_pano_outline_24;
                    }
                    A0v.add(A01);
                    i++;
                }
            }
            return A0v;
        }
        C04220Ms.A0E("selectedExperiment");
        throw null;
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    /* access modifiers changed from: private */
    public final void updateSelection(int i) {
        String str;
        AnonymousClass3YK r0 = this.selectedExperiment;
        if (r0 == null) {
            C04220Ms.A0E("selectedExperiment");
            throw null;
        }
        if (i < r0.A07.A00.size()) {
            AnonymousClass3YK r02 = this.selectedExperiment;
            if (r02 == null) {
                C04220Ms.A0E("selectedExperiment");
                throw null;
            }
            str = C61163Sd.A00(r02.A07.A00, i);
        } else {
            str = null;
        }
        AnonymousClass3YK r03 = this.selectedExperiment;
        if (r03 == null) {
            C04220Ms.A0E("selectedExperiment");
            throw null;
        }
        r03.A01(str);
        setItems(getMenuItems());
    }

    public C10300i6 getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    private final List getMenuItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A01("Name", A0v);
        AnonymousClass3YK r0 = this.selectedExperiment;
        if (r0 != null) {
            C63293hC.A02(r0.A09, A0v);
            C63613hu.A01("Group Count", A0v);
            AnonymousClass3YK r02 = this.selectedExperiment;
            if (r02 != null) {
                C63293hC.A02(String.valueOf(r02.A07.A00.size()), A0v);
                C63613hu.A01("Group Names", A0v);
                AnonymousClass3YK r03 = this.selectedExperiment;
                if (r03 != null) {
                    for (C61163Sd r04 : r03.A07.A00) {
                        C63293hC.A02(r04.A01, A0v);
                    }
                    C63613hu.A01("Select Group", A0v);
                    A0v.addAll(getGroupNamesMenuItems());
                    return A0v;
                }
            }
        }
        C04220Ms.A0E("selectedExperiment");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        int i;
        int A02 = C14030oh.A02(-185750953);
        super.onCreate(bundle);
        AnonymousClass3R8.A00(C18190wL.A09(this));
        String string = requireArguments().getString(this.SELECTED_LANDING_EXPERIMENT);
        if (string == null) {
            i = -1140524767;
        } else {
            AnonymousClass3YK r0 = (AnonymousClass3YK) C60913Rb.A01.get(string);
            if (r0 != null) {
                this.selectedExperiment = r0;
                i = 1748204030;
            } else {
                throw C18180wK.A0a(AnonymousClass00U.A0L("No experiment has been configured under name ", string));
            }
        }
        C14030oh.A09(i, A02);
    }
}
