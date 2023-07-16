package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.AbsListView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1XZ  reason: invalid class name */
public final class AnonymousClass1XZ extends C19130zL {
    public C36143JIh A00;
    public UserSession A01;
    public I45 A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public final Dialog A0C(Bundle bundle) {
        Context context = getContext();
        String str = this.A05;
        String str2 = this.A04;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(new C35187IpQ(str, str2));
        I45 i45 = new I45(context, A0v);
        this.A02 = i45;
        i45.A02 = C18210wN.A0H(this, 318);
        C25828Dsm A0W = C18190wL.A0W(getContext());
        A0W.A0q(true);
        Dialog A0G = A0W.A0G();
        A0G.setContentView(R.layout.rapidfeedback_dialog_view);
        AnonymousClass0wJ.A17(A0G.findViewById(R.id.close_button), 317, this);
        ((AbsListView) A0G.findViewById(R.id.rapidfeedback_page).requireViewById(R.id.rapidfeedback_page_list)).setAdapter(this.A02);
        C50182sa.A00(this.A01, AnonymousClass006.A00, this.A03, this.A08, this.A07, (List) null);
        return A0G;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(424100968);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A05 = requireArguments.getString("ARG_TOAST_TEXT");
        this.A04 = requireArguments.getString("ARG_INTRO_TOAST_BUTTON");
        this.A06 = requireArguments.getString("ARG_OUTRO_TOAST_TEXT");
        this.A03 = requireArguments.getString("ARG_INTEGRATION_POINT_ID");
        this.A08 = requireArguments.getString("ARG_SURVEY_ID");
        this.A07 = requireArguments.getString("ARG_SESSION_BLOB");
        String string = requireArguments.getString("ARG_SERIALIZED_MODEL_DATA");
        this.A01 = C18180wK.A0V(requireArguments);
        try {
            this.A00 = C36536JaD.parseFromJson(C18180wK.A0L(string));
            C14030oh.A09(-1200580557, A022);
        } catch (IOException e) {
            RuntimeException runtimeException = new RuntimeException(e);
            C14030oh.A09(487521712, A022);
            throw runtimeException;
        }
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-807645346);
        super.onResume();
        if (this.A08 == null) {
            A06();
        }
        C14030oh.A09(1411324257, A022);
    }
}
