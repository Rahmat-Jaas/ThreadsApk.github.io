package com.instagram.debug.devoptions;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.AnonymousClass8bP;
import X.C04220Ms;
import X.C09860go;
import X.C10300i6;
import X.C10600ic;
import X.C11610kU;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C18250wR;
import X.C25348Dk8;
import X.C34640IcN;
import X.C63813iO;
import X.C82034oy;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DeveloperLoggingHostFragment extends C34640IcN implements C82034oy {
    public static final Companion Companion = new Companion();
    public static final String OD_TEMPLATE_ADDRESS = "graph.svcscm..od.facebook.com";
    public static final int TEMPLATE_INDEX = 13;
    public EditText editText;
    public C10300i6 session;

    public void configureActionBar(AnonymousClass4u2 r5) {
        C04220Ms.A0B(r5, 0);
        r5.Crr(new C25348Dk8(new DeveloperLoggingHostFragment$configureActionBar$1(this), AnonymousClass0wJ.A0B(this).getString(2131824970), 0)).setEnabled(true);
    }

    public String getModuleName() {
        return "set_logging_host";
    }

    public void setSession(C10300i6 r2) {
        C04220Ms.A0B(r2, 0);
        this.session = r2;
    }

    public C10300i6 getSession() {
        C10300i6 r0 = this.session;
        if (r0 != null) {
            return r0;
        }
        C18250wR.A0l();
        throw null;
    }

    public final void setLoggingHost() {
        Editable text;
        String obj;
        String A0o;
        EditText editText2 = this.editText;
        if (editText2 != null && (text = editText2.getText()) != null && (obj = text.toString()) != null) {
            if (obj.length() > 0 && !AnonymousClass8bP.A0j(obj, ".", false)) {
                obj = AnonymousClass00U.A0V("graph.", obj, ".sb.facebook.com");
            }
            C11610kU r1 = C11610kU.A01;
            if (r1 == null) {
                r1 = new C11610kU(C10600ic.A00);
                C11610kU.A01 = r1;
            }
            C18180wK.A0v(r1.A00.edit(), "logging_host", obj);
            FragmentActivity requireActivity = requireActivity();
            if (obj.length() == 0) {
                A0o = getString(2131824974);
            } else {
                A0o = AnonymousClass0wJ.A0o(this, obj, 2131824975);
            }
            C04220Ms.A09(A0o);
            C63813iO.A02(requireActivity, A0o, (String) null, 0);
            requireActivity.onBackPressed();
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(478124441);
        super.onCreate(bundle);
        setSession(C18200wM.A0V(this));
        C14030oh.A09(-2039749956, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1523442681);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_set_logging_host, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.edit_logging_host);
        EditText editText2 = (EditText) requireViewById;
        this.editText = editText2;
        C04220Ms.A06(requireViewById);
        C11610kU r1 = C11610kU.A01;
        if (r1 == null) {
            r1 = new C11610kU(C10600ic.A00);
            C11610kU.A01 = r1;
        }
        editText2.setText(C18250wR.A0W(r1.A00, "logging_host"));
        editText2.setOnEditorActionListener(new DeveloperLoggingHostFragment$onCreateView$1(this));
        AnonymousClass0wJ.A0K(inflate, R.id.template_button).setOnClickListener(new DeveloperLoggingHostFragment$onCreateView$2(editText2));
        AnonymousClass0wJ.A0K(inflate, R.id.clear_save_button).setOnClickListener(new DeveloperLoggingHostFragment$onCreateView$3(editText2, this));
        C14030oh.A09(582420872, A02);
        return inflate;
    }

    public void onDestroyView() {
        int A02 = C14030oh.A02(-1899915110);
        super.onDestroyView();
        this.editText = null;
        C14030oh.A09(1790034784, A02);
    }

    public void onPause() {
        int A02 = C14030oh.A02(1253048385);
        C09860go.A0I(this.editText);
        super.onPause();
        C14030oh.A09(-1544940431, A02);
    }
}
