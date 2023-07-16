package com.instagram.debug.devoptions;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.AnonymousClass4VZ;
import X.AnonymousClass4n8;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C06750aI;
import X.C09120et;
import X.C23411dm;
import X.C40877Lpc;
import X.C41026Luf;
import X.C677640l;
import X.C80644m9;
import X.C82034oy;
import X.L7u;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;

public final class BladerunnerRequestStreamSettingsFragment extends C23411dm implements C82034oy {
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public enum RealTimeSandboxConfigSourceKey {
        BLADERUNNER,
        DISTILLERY,
        WWW
    }

    public String getModuleName() {
        return "bladerunner_requeststream_settings";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        generateView();
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0011 */
        static {
            /*
                com.instagram.debug.devoptions.BladerunnerRequestStreamSettingsFragment$RealTimeSandboxConfigSourceKey[] r0 = com.instagram.debug.devoptions.BladerunnerRequestStreamSettingsFragment.RealTimeSandboxConfigSourceKey.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.instagram.debug.devoptions.BladerunnerRequestStreamSettingsFragment$RealTimeSandboxConfigSourceKey r0 = com.instagram.debug.devoptions.BladerunnerRequestStreamSettingsFragment.RealTimeSandboxConfigSourceKey.BLADERUNNER     // Catch:{ NoSuchFieldError -> 0x000c }
                X.C18240wQ.A1E(r0, r2)     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                com.instagram.debug.devoptions.BladerunnerRequestStreamSettingsFragment$RealTimeSandboxConfigSourceKey r0 = com.instagram.debug.devoptions.BladerunnerRequestStreamSettingsFragment.RealTimeSandboxConfigSourceKey.DISTILLERY     // Catch:{ NoSuchFieldError -> 0x0011 }
                X.C18240wQ.A1F(r0, r2)     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                com.instagram.debug.devoptions.BladerunnerRequestStreamSettingsFragment$RealTimeSandboxConfigSourceKey r0 = com.instagram.debug.devoptions.BladerunnerRequestStreamSettingsFragment.RealTimeSandboxConfigSourceKey.WWW     // Catch:{ NoSuchFieldError -> 0x001a }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x001a }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x001a }
            L_0x001a:
                $EnumSwitchMapping$0 = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.BladerunnerRequestStreamSettingsFragment.WhenMappings.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public final void generateView() {
        C09120et.A3D.A00();
        setItems(C06750aI.A17(getMenuItem("Override WWW Host", "od.12345 / www.od.12345.facebook.com / <unixname>.sb", "Sets \"www_sandbox\" header (for FBGQLS)\nControls where Bladerunner finds WWW\nCommon overrides are:\nod.12345\nwww.od.12345.facebook.com\n<unixname>.sb\nLeave blank for default", RealTimeSandboxConfigSourceKey.WWW), getMenuItem("Override Distillery Host", "xxxxx.od.fbinfra.net:8086", "Sets \"distillery_osandbox\" header (for IGGQLS)\nControls where Bladerunner finds Distillery\nCommon overrides are:\nxxxxx.od.fbinfra.net:8086\nLeave blank for default", RealTimeSandboxConfigSourceKey.DISTILLERY), getMenuItem("Override Bladerunner Host", "xxxxx.od.fbinfra.net:18295", "Sets \"OverrideServer\" header\nControls where Warpgate/Stargate finds Bladerunnner\nCommon overrides are:\nxxxxx.od.fbinfra.net:18295\ndevvmXXXXX.vll0.facebook.com:18295\nLeave blank for default", RealTimeSandboxConfigSourceKey.BLADERUNNER)));
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A08(r2, "Bladerunner RequestStream");
        }
    }

    private final AnonymousClass4MA getMenuItem(String str, String str2, String str3, RealTimeSandboxConfigSourceKey realTimeSandboxConfigSourceKey) {
        IgLinearLayout igLinearLayout = new IgLinearLayout(requireContext());
        igLinearLayout.setOrientation(1);
        SearchEditText searchEditText = new SearchEditText(requireContext());
        searchEditText.setHint(str2);
        String valueForSandboxOverride = getValueForSandboxOverride(realTimeSandboxConfigSourceKey);
        if (valueForSandboxOverride != null) {
            searchEditText.setText(valueForSandboxOverride);
        }
        searchEditText.setInputType(1);
        searchEditText.setPadding(4, 4, 4, 4);
        igLinearLayout.addView(searchEditText);
        IgTextView igTextView = new IgTextView(requireContext());
        igTextView.setText(str3);
        igTextView.setPadding(12, 12, 12, 12);
        igTextView.setTextColor(Color.parseColor("#999999"));
        igLinearLayout.addView(igTextView);
        C41026Luf luf = new C41026Luf(requireContext());
        luf.A08(str);
        C40877Lpc lpc = luf.A01;
        luf.A07(igLinearLayout);
        BladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$1 bladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$1 = new BladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$1(this, realTimeSandboxConfigSourceKey);
        lpc.A0E = lpc.A0L.getText(2131825397);
        lpc.A02 = bladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$1;
        luf.A03(new BladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$2(this, realTimeSandboxConfigSourceKey, searchEditText), 2131826219);
        L7u A00 = luf.A00();
        String valueForSandboxOverride2 = getValueForSandboxOverride(realTimeSandboxConfigSourceKey);
        if (valueForSandboxOverride2.length() == 0) {
            valueForSandboxOverride2 = "(default)";
        }
        return AnonymousClass4MA.A01(new BladerunnerRequestStreamSettingsFragment$getMenuItem$3(A00), AnonymousClass4n8.A09(AnonymousClass00U.A0d(str, "\n      |", valueForSandboxOverride2, "\n    "), "|"));
    }

    private final String getValueForSandboxOverride(RealTimeSandboxConfigSourceKey realTimeSandboxConfigSourceKey) {
        String bladerunnerSandbox;
        int ordinal = realTimeSandboxConfigSourceKey.ordinal();
        if (ordinal == 0) {
            bladerunnerSandbox = C677640l.A00().getBladerunnerSandbox();
        } else if (ordinal == 1) {
            bladerunnerSandbox = C677640l.A00().getDistillerySandbox();
        } else if (ordinal == 2) {
            bladerunnerSandbox = C677640l.A00().getWwwSandbox();
        } else {
            throw AnonymousClass4VZ.A00();
        }
        if (bladerunnerSandbox != null) {
            return bladerunnerSandbox;
        }
        return "";
    }

    /* access modifiers changed from: private */
    public final void setValueForSandboxOverride(RealTimeSandboxConfigSourceKey realTimeSandboxConfigSourceKey, String str) {
        int ordinal = realTimeSandboxConfigSourceKey.ordinal();
        if (ordinal == 0) {
            C677640l.A00().setBladerunnerSandbox(str);
        } else if (ordinal == 1) {
            C677640l.A00().setDistillerySandbox(str);
        } else if (ordinal == 2) {
            C677640l.A00().setWwwSandbox(str);
        } else {
            throw AnonymousClass4VZ.A00();
        }
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
