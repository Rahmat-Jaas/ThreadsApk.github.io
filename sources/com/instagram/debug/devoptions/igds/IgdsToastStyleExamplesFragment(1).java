package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C14030oh;
import X.C23411dm;
import X.C63613hu;
import X.C63813iO;
import X.C82034oy;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

public class IgdsToastStyleExamplesFragment extends C23411dm implements C82034oy {
    public static final String LONG_TOAST_MESSAGE = "Meaninglessly long toast message that should span across several lines for testing. Meaninglessly long toast message that should span across several lines for testing";
    public static final String REGULAR_TOAST_MESSAGE = "Regular toast message";
    public Context mContext;
    public UserSession mUserSession;

    public String getModuleName() {
        return "igds_toast_style_examples";
    }

    private View.OnClickListener getClickListener(final String str, final int i) {
        return new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = C14030oh.A05(-1645157219);
                C63813iO.A0D(IgdsToastStyleExamplesFragment.this.mContext, IgdsToastStyleExamplesFragment.LONG_TOAST_MESSAGE, 1);
                C14030oh.A0C(1197113874, A05);
            }
        };
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    private void setAndCreateItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A01("IGDS Toast Style", A0v);
        AnonymousClass4MA.A02(new View.OnClickListener(REGULAR_TOAST_MESSAGE, 0) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(-1645157219);
                C63813iO.A0D(IgdsToastStyleExamplesFragment.this.mContext, IgdsToastStyleExamplesFragment.LONG_TOAST_MESSAGE, 1);
                C14030oh.A0C(1197113874, A05);
            }
        }, "Toast with short duration", A0v);
        AnonymousClass4MA.A02(new View.OnClickListener(REGULAR_TOAST_MESSAGE, 1) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(-1645157219);
                C63813iO.A0D(IgdsToastStyleExamplesFragment.this.mContext, IgdsToastStyleExamplesFragment.LONG_TOAST_MESSAGE, 1);
                C14030oh.A0C(1197113874, A05);
            }
        }, "Toast with long duration", A0v);
        AnonymousClass4MA.A02(new View.OnClickListener(LONG_TOAST_MESSAGE, 1) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(-1645157219);
                C63813iO.A0D(IgdsToastStyleExamplesFragment.this.mContext, IgdsToastStyleExamplesFragment.LONG_TOAST_MESSAGE, 1);
                C14030oh.A0C(1197113874, A05);
            }
        }, "Toast with long duration and long text", A0v);
        setItems(A0v);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131825261);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-680003754);
        super.onCreate(bundle);
        this.mUserSession = AnonymousClass0wJ.A0W(this);
        this.mContext = requireContext();
        C14030oh.A09(-699413781, A02);
    }

    public void onResume() {
        int A02 = C14030oh.A02(913362816);
        super.onResume();
        setAndCreateItems();
        C14030oh.A09(1403386781, A02);
    }
}
