package com.instagram.debug.devoptions.section.newusernux;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass2AQ;
import X.AnonymousClass3XW;
import X.AnonymousClass4UR;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C14030oh;
import X.C18220wO;
import X.C27551sh;
import X.C313625r;
import X.C34640IcN;
import X.C58723Gw;
import X.C61343Sv;
import X.C67073yp;
import X.C82034oy;
import X.C82834qL;
import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class NuxSelectionFragment extends C34640IcN implements C82034oy {
    public C58723Gw currentState;
    public final C67073yp delegate = new C67073yp();
    public AnonymousClass3XW factory;
    public C27551sh logic;
    public final LinkedHashMap onboardingStepMap = C18220wO.A0y();
    public final C04530Oa userSession$delegate = new AnonymousClass4UR(new NuxSelectionFragment$userSession$2(this));

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A08(r2, "Custom NUX Flow");
    }

    public String getModuleName() {
        return "nux_selection_fragment";
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    /* access modifiers changed from: private */
    public final void resetAllCheckBoxes(boolean z) {
        for (Object obj : this.onboardingStepMap.keySet()) {
            CompoundButton compoundButton = (CompoundButton) this.onboardingStepMap.get(obj);
            if (compoundButton != null) {
                compoundButton.setChecked(z);
            }
        }
    }

    public C10300i6 getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    /* access modifiers changed from: private */
    public final List getSerializableSteps() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : this.onboardingStepMap.keySet()) {
            C04220Ms.A06(next);
            AnonymousClass2AQ r2 = (AnonymousClass2AQ) next;
            CompoundButton compoundButton = (CompoundButton) this.onboardingStepMap.get(r2);
            if (compoundButton != null && compoundButton.isChecked()) {
                A0v.add(new C61343Sv(r2, (String) null));
            }
        }
        return A0v;
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1411279639);
        super.onCreate(bundle);
        Context context = getContext();
        if (context != null) {
            C67073yp r1 = this.delegate;
            r1.A01 = C313625r.EMAIL;
            r1.A02 = AnonymousClass006.A00;
            r1.A00 = AnonymousClass0wJ.A0X(this.userSession$delegate);
            this.factory = new AnonymousClass3XW(this.delegate);
            C27551sh A00 = C27551sh.A00(context, AnonymousClass0wJ.A0X(this.userSession$delegate), this.delegate, (C82834qL) null);
            this.logic = A00;
            this.currentState = A00.A01;
        }
        C14030oh.A09(500663551, A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008d, code lost:
        if (X.AnonymousClass3XW.A00(r1, r7, (java.lang.String) null).A00() != true) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r18, android.view.ViewGroup r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r0 = -1766146150(0xffffffff96babf9a, float:-3.0170838E-25)
            int r16 = X.C14030oh.A02(r0)
            r14 = 0
            r2 = r18
            X.C04220Ms.A0B(r2, r14)
            r0 = 2131495988(0x7f0c0c34, float:1.8615528E38)
            r1 = r19
            android.view.View r3 = r2.inflate(r0, r1, r14)
            r0 = 2131303898(0x7f091dda, float:1.8225923E38)
            android.view.View r13 = X.AnonymousClass0wJ.A0J(r3, r0)
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            r5 = r17
            android.content.Context r0 = r5.getContext()
            r12 = -1
            r11 = -2
            if (r0 == 0) goto L_0x004b
            com.instagram.common.ui.base.IgTextView r4 = new com.instagram.common.ui.base.IgTextView
            r4.<init>(r0)
            r0 = 2131825106(0x7f1111d2, float:1.9283059E38)
            X.C18180wK.A10(r4, r5, r0)
            r0 = 17
            r4.setGravity(r0)
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r2.<init>(r11, r12)
            r1 = 10
            r0 = 15
            r2.setMargins(r14, r1, r14, r0)
            r4.setLayoutParams(r2)
            r13.addView(r4)
        L_0x004b:
            X.2AQ[] r10 = X.AnonymousClass2AQ.values()
            int r9 = r10.length
            r8 = 0
        L_0x0051:
            if (r8 >= r9) goto L_0x00b4
            r7 = r10[r8]
            X.2AQ r0 = X.AnonymousClass2AQ.UNKNOWN
            if (r7 == r0) goto L_0x00b1
            android.content.Context r0 = r5.getContext()
            android.widget.CheckBox r6 = new android.widget.CheckBox
            r6.<init>(r0)
            java.lang.String r0 = r7.toString()
            r6.setText(r0)
            java.util.LinkedHashMap r0 = r5.onboardingStepMap
            r0.put(r7, r6)
            r13.addView(r6)
            android.content.Context r0 = r5.getContext()
            r4 = 1
            if (r0 == 0) goto L_0x00a6
            com.instagram.common.ui.base.IgTextView r15 = new com.instagram.common.ui.base.IgTextView
            r15.<init>(r0)
            X.3XW r1 = r5.factory
            if (r1 == 0) goto L_0x008f
            r0 = 0
            X.3IX r0 = X.AnonymousClass3XW.A00(r1, r7, r0)
            boolean r1 = r0.A00()
            r0 = 2131825105(0x7f1111d1, float:1.9283057E38)
            if (r1 == r4) goto L_0x0092
        L_0x008f:
            r0 = 2131825107(0x7f1111d3, float:1.928306E38)
        L_0x0092:
            X.C18180wK.A10(r15, r5, r0)
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r2.<init>(r11, r12)
            r1 = 100
            r0 = 5
            r2.setMargins(r1, r14, r14, r0)
            r15.setLayoutParams(r2)
            r13.addView(r15)
        L_0x00a6:
            com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$3 r0 = new com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$3
            r0.<init>(r7)
            r6.setOnCheckedChangeListener(r0)
            r6.setChecked(r4)
        L_0x00b1:
            int r8 = r8 + 1
            goto L_0x0051
        L_0x00b4:
            r0 = 2131298399(0x7f09085f, float:1.821477E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0K(r3, r0)
            com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$4 r0 = new com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$4
            r0.<init>(r5)
            r1.setOnClickListener(r0)
            r0 = 2131306817(0x7f092941, float:1.8231844E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0K(r3, r0)
            com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$5 r0 = new com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$5
            r0.<init>(r5)
            r1.setOnClickListener(r0)
            r0 = 2131302355(0x7f0917d3, float:1.8222794E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0K(r3, r0)
            com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$6 r0 = new com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$6
            r0.<init>(r5)
            r1.setOnClickListener(r0)
            r1 = -1202952627(0xffffffffb84c664d, float:-4.8732665E-5)
            r0 = r16
            X.C14030oh.A09(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroy() {
        C27551sh r0;
        int A02 = C14030oh.A02(253182256);
        super.onDestroy();
        C58723Gw r1 = this.currentState;
        if (!(r1 == null || (r0 = this.logic) == null)) {
            r0.A07(r1);
        }
        AnonymousClass3XW.A01.clear();
        C14030oh.A09(-1956248122, A02);
    }
}
