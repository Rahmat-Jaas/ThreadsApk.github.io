package com.instagram.debug.quickexperiment;

import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C09120et;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C18240wQ;
import X.C23411dm;
import X.C551131u;
import X.C61823Vx;
import X.C63063bP;
import X.C63273h9;
import X.C63613hu;
import X.C63813iO;
import X.C64533mV;
import X.C81634o7;
import X.C82034oy;
import X.C83064qj;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public class QuickExperimentSpoofFragment extends C23411dm implements C82034oy {
    public final C83064qj mEditDelegate = new C83064qj() {
        public void onTextChanged(String str) {
        }
    };
    public final C81634o7 mSpoofOverlayDelegate = new C81634o7() {
        public void onOperationStart() {
        }
    };
    public final TextView.OnEditorActionListener mTextDelegate = new TextView.OnEditorActionListener() {
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return false;
        }
    };
    public UserSession mUserSession;

    public String getModuleName() {
        return "QuickExperimentSpoofFragment";
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        r2.setTitle("Spoof menu");
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    private List getDeviceSpoofOptions() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        final UserSession A0V = C18180wK.A0V(this.mArguments);
        final C09120et A02 = C09120et.A02();
        C63613hu.A01("Device Spoof", A0v);
        String A0j = C18200wM.A0j(A02.A0B);
        if (A0j == null) {
            A0j = "";
        }
        final C64533mV r5 = new C64533mV(this.mTextDelegate, this.mEditDelegate, 524288, "Enter spoofed device's id", A0j, true);
        AnonymousClass6 r1 = new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = C14030oh.A05(1957219772);
                if (A02.A0M()) {
                    C63813iO.A01(QuickExperimentSpoofFragment.this.getActivity(), AnonymousClass00U.A0V("Already Spoofing on ", C18200wM.A0j(A02.A0B), ". Clear spoof before spoofing again."));
                } else {
                    C61823Vx r3 = C61823Vx.A01;
                    if (r3 != null) {
                        String str = r5.A00;
                        r3.A00 = QuickExperimentSpoofFragment.this.mSpoofOverlayDelegate;
                        r3.A07(A0V, str, 1);
                    } else {
                        AnonymousClass0LU.A0B("QuickExperimentSpoofFragment", "QuickExperimentManagerFactory is null");
                    }
                }
                C14030oh.A0C(766395888, A05);
            }
        };
        AnonymousClass7 r3 = new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = C14030oh.A05(479793891);
                C551131u.A00(1);
                C18240wQ.A1D(C09120et.A02().A0B, (Object) null);
                C14030oh.A0C(50143147, A05);
            }
        };
        C63063bP r2 = new C63063bP(r1, 2131836093);
        C63063bP r0 = new C63063bP(r3, 2131823320);
        A0v.add(r5);
        A0v.add(r2);
        A0v.add(r0);
        return A0v;
    }

    private List getUserSpoofOptions() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        final C09120et A02 = C09120et.A02();
        String A0j = C18200wM.A0j(A02.A0D);
        C63613hu.A01("User Spoof", A0v);
        if (A0j == null) {
            A0j = "";
        }
        final C64533mV r5 = new C64533mV(this.mTextDelegate, this.mEditDelegate, 2, "Enter spoofed user's IGID", A0j, true);
        AnonymousClass4 r1 = new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = C14030oh.A05(-1135532999);
                if (A02.A0N()) {
                    C63813iO.A01(QuickExperimentSpoofFragment.this.getActivity(), AnonymousClass00U.A0V("Already Spoofing on ", C18200wM.A0j(A02.A0D), ". Clear spoof before spoofing again."));
                } else {
                    C61823Vx r3 = C61823Vx.A01;
                    if (r3 != null) {
                        String str = r5.A00;
                        QuickExperimentSpoofFragment quickExperimentSpoofFragment = QuickExperimentSpoofFragment.this;
                        r3.A00 = quickExperimentSpoofFragment.mSpoofOverlayDelegate;
                        r3.A07(quickExperimentSpoofFragment.mUserSession, str, 2);
                    } else {
                        AnonymousClass0LU.A0B("QuickExperimentSpoofFragment", "QuickExperimentManagerFactory is null");
                    }
                }
                C14030oh.A0C(-262103899, A05);
            }
        };
        AnonymousClass5 r3 = new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = C14030oh.A05(2050375452);
                C551131u.A00(2);
                C18240wQ.A1D(C09120et.A02().A0D, (Object) null);
                C14030oh.A0C(685853219, A05);
            }
        };
        C63063bP r2 = new C63063bP(r1, 2131836094);
        C63063bP r0 = new C63063bP(r3, 2131823321);
        A0v.add(r5);
        A0v.add(r2);
        A0v.add(r0);
        return A0v;
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-790715324);
        super.onCreate(bundle);
        this.mUserSession = C18180wK.A0V(this.mArguments);
        C14030oh.A09(732412857, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.addAll(getUserSpoofOptions());
        C63273h9.A02(A0v);
        A0v.addAll(getDeviceSpoofOptions());
        setItems(A0v);
    }
}
