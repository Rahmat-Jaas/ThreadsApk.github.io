package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass22b;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C06750aI;
import X.C14030oh;
import X.C18180wK;
import X.C18240wQ;
import X.C23411dm;
import X.C306022c;
import X.C63613hu;
import X.C82034oy;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsSnackbarStyleExamplesFragment extends C23411dm implements C82034oy {
    public static final String BUTTON_TEXT = "Action";
    public static final Companion Companion = new Companion();
    public static final String DESCRIPTION_TEXT = "This is a description message.";
    public static final String LONG_CTA_TEXT = "Long Action Text";
    public static final String MESSAGE_TEXT = "Message Text";
    public final C04530Oa userSession$delegate = AnonymousClass0OY.A02(new IgdsSnackbarStyleExamplesFragment$userSession$2(this));

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825253);
    }

    public String getModuleName() {
        return "igds_snackbar_examples";
    }

    private final View.OnClickListener getClickListener(C306022c r14, String str, String str2, String str3, String str4, int i, AnonymousClass22b r20, boolean z, boolean z2, boolean z3, boolean z4) {
        return new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r14, str, this, str2, str3, str4, i, r20, z3, z2, z, z4);
    }

    public static /* synthetic */ View.OnClickListener getClickListener$default(IgdsSnackbarStyleExamplesFragment igdsSnackbarStyleExamplesFragment, C306022c r16, String str, String str2, String str3, String str4, int i, AnonymousClass22b r22, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        int i3 = i2;
        AnonymousClass22b r10 = r22;
        int i4 = i;
        String str5 = str3;
        String str6 = str2;
        String str7 = str;
        C306022c r3 = r16;
        if ((i2 & 1) != 0) {
            r3 = C306022c.DEFAULT;
        }
        if ((i2 & 2) != 0) {
            str7 = MESSAGE_TEXT;
        }
        String str8 = null;
        if ((i2 & 4) != 0) {
            str6 = null;
        }
        if ((i2 & 8) != 0) {
            str5 = null;
        }
        if ((i2 & 16) == 0) {
            str8 = str4;
        }
        boolean z5 = false;
        if ((i2 & 32) != 0) {
            i4 = 0;
        }
        if ((i2 & 64) != 0) {
            r10 = AnonymousClass22b.NONE;
        }
        boolean A1R = C18240wQ.A1R(i3 & 128, z);
        boolean A1R2 = C18240wQ.A1R(i3 & 256, z2);
        boolean A1R3 = C18240wQ.A1R(i3 & 512, z3);
        if ((i3 & 1024) == 0) {
            z5 = z4;
        }
        return new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r3, str7, igdsSnackbarStyleExamplesFragment, str6, str5, str8, i4, r10, A1R3, A1R2, A1R, z5);
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    private final void setAndCreateItems() {
        C63613hu r4 = new C63613hu((CharSequence) "IGDS Snackbar Style");
        C306022c r26 = C306022c.DEFAULT;
        AnonymousClass22b r33 = AnonymousClass22b.NONE;
        AnonymousClass4MA A01 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r26, MESSAGE_TEXT, this, (String) null, (String) null, (String) null, 0, r33, false, false, false, false), "Snack with message");
        C306022c r7 = r26;
        String str = MESSAGE_TEXT;
        AnonymousClass22b r14 = r33;
        AnonymousClass4MA A012 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r7, str, this, (String) null, (String) null, (String) null, 0, r14, false, false, false, true), "Snack with message - longer duration");
        AnonymousClass22b r42 = r14;
        AnonymousClass4MA A013 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r7, str, this, DESCRIPTION_TEXT, (String) null, (String) null, 0, r42, false, false, false, false), "Snack with description");
        AnonymousClass4MA A014 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r26, MESSAGE_TEXT, this, (String) null, "Action", (String) null, 0, r33, false, false, false, false), "Snack with button");
        C306022c r35 = r26;
        String str2 = MESSAGE_TEXT;
        AnonymousClass4MA A015 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r35, str2, this, DESCRIPTION_TEXT, "Action", (String) null, 0, r42, false, false, false, false), "Snack with button + description");
        C306022c r40 = r26;
        AnonymousClass22b r47 = r14;
        AnonymousClass4MA A016 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r40, C18180wK.A0g(this, 2131828633), this, (String) null, (String) null, (String) null, 0, r47, false, false, false, false), "Snack with long message");
        AnonymousClass4MA A017 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r40, MESSAGE_TEXT, this, getString(2131828633), (String) null, (String) null, 0, r47, false, false, false, false), "Snack with long description");
        String str3 = "Action";
        AnonymousClass4MA A018 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r40, C18180wK.A0g(this, 2131828633), this, (String) null, str3, (String) null, 0, r47, false, false, false, false), "Snack with long message + text button");
        AnonymousClass4MA A019 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r26, C18180wK.A0g(this, 2131828633), this, (String) null, (String) null, (String) null, R.drawable.instagram_star_pano_outline_24, r33, false, false, false, false), "Snack with long message + icon button");
        String string = getString(2131828633);
        String str4 = MESSAGE_TEXT;
        AnonymousClass4MA A0110 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r40, str4, this, string, str3, (String) null, 0, r47, false, false, false, false), "Snack with long description + text button");
        AnonymousClass4MA A0111 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r40, str4, this, (String) null, (String) null, (String) null, 0, AnonymousClass22b.SQUARE, false, false, false, false), "Snack with square image");
        AnonymousClass4MA A0112 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r40, str4, this, (String) null, (String) null, (String) null, 0, AnonymousClass22b.CIRCULAR, false, false, false, false), "Snack with circular image");
        AnonymousClass22b r53 = AnonymousClass22b.AVATAR;
        AnonymousClass4MA A0113 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r26, "Switched to some_account_name", this, (String) null, (String) null, (String) null, 0, r53, false, false, true, false), "Snack with single avatar + bold text");
        AnonymousClass22b r472 = r53;
        AnonymousClass4MA A0114 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r40, str4, this, (String) null, (String) null, (String) null, 0, r472, false, true, false, false), "Snack with single avatar + presence indicator");
        AnonymousClass4MA A0115 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r40, str4, this, (String) null, (String) null, (String) null, 0, r472, true, false, false, false), "Snack with stacked avatars");
        AnonymousClass22b r422 = AnonymousClass22b.ICON;
        AnonymousClass4MA A0116 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r35, str2, this, DESCRIPTION_TEXT, (String) null, (String) null, 0, r422, false, false, false, false), "Snack with icon + description");
        AnonymousClass4MA A0117 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r35, str2, this, DESCRIPTION_TEXT, "Action", (String) null, 0, r422, false, false, false, false), "Snack with icon + description + button");
        AnonymousClass22b r423 = r33;
        AnonymousClass4MA A0118 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(C306022c.ERROR, "This is an error message.", this, (String) null, (String) null, "igds_snackbar_style_example", 0, r423, false, false, false, false), "Snackbar style: error");
        AnonymousClass4MA A0119 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(C306022c.SUCCESS, "This is a success message.", this, (String) null, (String) null, (String) null, 0, r423, false, false, false, false), "Snackbar style: success");
        AnonymousClass4MA A0120 = AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r26, MESSAGE_TEXT, this, (String) null, LONG_CTA_TEXT, (String) null, 0, r33, false, false, false, false), "Snack with long button text + short message");
        String A0g = C18180wK.A0g(this, 2131828633);
        C306022c r352 = r26;
        String str5 = LONG_CTA_TEXT;
        setItems(C06750aI.A17(r4, A01, A012, A013, A014, A015, A016, A017, A018, A019, A0110, A0111, A0112, A0113, A0114, A0115, A0116, A0117, A0118, A0119, A0120, AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r352, A0g, this, (String) null, str5, (String) null, 0, r423, false, false, false, false), "Snack with long button text + long message"), AnonymousClass4MA.A01(new IgdsSnackbarStyleExamplesFragment$getClickListener$1(r352, MESSAGE_TEXT, this, getString(2131828633), str5, (String) null, 0, r423, false, false, false, false), "Snack with long button text + long description")));
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public void onResume() {
        int A02 = C14030oh.A02(-1175763529);
        super.onResume();
        setAndCreateItems();
        C14030oh.A09(-375519115, A02);
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
