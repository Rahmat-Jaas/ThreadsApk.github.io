package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C14030oh;
import X.C34640IcN;
import X.C82034oy;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.service.session.UserSession;

public class IgdsStepperHeaderExamplesFragment extends C34640IcN implements C82034oy {
    public static final String BUTTON_TEXT = "Progress Stepper";
    public static final int MAX_STEPS = 5;
    public static final int MINIMUM_STEP = 0;
    public Context mContext;
    public LinearLayout mLinearLayout;
    public UserSession mUserSession;

    public String getModuleName() {
        return "igds_stepper_header_examples";
    }

    private void configureStepperHeader(String str, boolean z, boolean z2) {
        IgdsStepperHeader igdsStepperHeader = new IgdsStepperHeader(this.mContext);
        int i = 0;
        if (z2) {
            i = 4;
        }
        igdsStepperHeader.A02(i, 5, z, z2);
        igdsStepperHeader.A00();
        AnonymousClass1 r3 = new View.OnClickListener(z2, igdsStepperHeader, z) {
            public int mCurrentStep;
            public final /* synthetic */ boolean val$isAnimated;
            public final /* synthetic */ boolean val$isBackward;
            public final /* synthetic */ IgdsStepperHeader val$stepperHeader;

            {
                this.val$isBackward = r3;
                this.val$stepperHeader = r4;
                this.val$isAnimated = r5;
                this.mCurrentStep = r3 ? 4 : 0;
            }

            public void onClick(View view) {
                int i;
                int A05 = C14030oh.A05(760728260);
                boolean z = this.val$isBackward;
                int i2 = this.mCurrentStep;
                if (z) {
                    i = i2 - 1;
                } else {
                    i = (i2 + 1) % 5;
                }
                this.mCurrentStep = i;
                this.val$stepperHeader.A02(i, 5, this.val$isAnimated, z);
                this.val$stepperHeader.A00();
                C14030oh.A0C(-1721094347, A05);
            }
        };
        IgdsComponentDemoRow igdsComponentDemoRow = new IgdsComponentDemoRow(this.mContext, str, igdsStepperHeader);
        IgdsBottomButtonLayout igdsBottomButtonLayout = new IgdsBottomButtonLayout(this.mContext);
        igdsBottomButtonLayout.setPrimaryAction(BUTTON_TEXT, r3);
        this.mLinearLayout.addView(igdsComponentDemoRow);
        this.mLinearLayout.addView(igdsBottomButtonLayout);
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131825254);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1709621707);
        super.onCreate(bundle);
        this.mContext = requireContext();
        this.mUserSession = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(-174337750, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1528319241);
        View inflate = layoutInflater.inflate(R.layout.igds_showcase_scrollview, viewGroup, false);
        this.mLinearLayout = (LinearLayout) inflate.requireViewById(R.id.igds_component_examples_container);
        configureStepperHeader("Animated", true, false);
        configureStepperHeader("Not Animated", false, false);
        configureStepperHeader("Animated - Backwards", true, true);
        configureStepperHeader("Not Animated - Backwards", false, true);
        C14030oh.A09(-1296822091, A02);
        return inflate;
    }
}
