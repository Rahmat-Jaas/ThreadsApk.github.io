package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.1wE  reason: invalid class name */
public final class AnonymousClass1wE extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "MessagesAndStoryRepliesFragment";
    public final C63273h9 A00 = new C63273h9();
    public final C04530Oa A01 = C80644m9.A00(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A03(A0v, 2131830435);
        C23411dm.A02(C18210wN.A0H(this, 172), A0v, 2131830430);
        C23411dm.A02(C18210wN.A0H(this, 173), A0v, 2131836275);
        C04530Oa r3 = this.A01;
        UserSession A0X = AnonymousClass0wJ.A0X(r3);
        if (AnonymousClass0wJ.A1X(AnonymousClass3WI.A00(A0X).A0F.get()) || AnonymousClass2MV.A00(A0X).A02()) {
            C23411dm.A02(C18210wN.A0H(this, 174), A0v, 2131826839);
        }
        if (AnonymousClass3X2.A00(AnonymousClass0wJ.A0X(r3), true)) {
            A0v.add(this.A00);
            C63613hu.A03(A0v, 2131830436);
            C23411dm.A02(C18210wN.A0H(this, 175), A0v, 2131831921);
        }
        A0v.add(this.A00);
        C63613hu.A03(A0v, 2131830434);
        C23411dm.A02(C18210wN.A0H(this, 176), A0v, 2131820977);
        setItems(A0v);
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A07(r2, 2131830437);
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }
}
