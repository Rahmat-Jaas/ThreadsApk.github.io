package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C14030oh;
import X.C18210wN;
import X.C23411dm;
import X.C37032Jj9;
import X.C63613hu;
import X.C82034oy;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

public class IgdsBottomSheetExamplesFragment extends C23411dm implements C82034oy {
    public static final String BACK_TEXT = "Back";
    public static final String CANCEL_TEXT = "Cancel";
    public static final String DONE_TEXT = "Done";
    public static final String LONG_TEXT = "Meaninglessly long toast message that should span across several lines for testing";
    public static final String MORE_TEXT = "More Options";
    public static final String SHOPPING_CART_LABEL = "Shopping cart";
    public static final String SUBTITLE = "My subtitle";
    public static final String TITLE = "My Title";
    public Context mContext;
    public UserSession mUserSession;

    private View.OnClickListener getClickListener(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str, String str2, String str3, String str4) {
        final C37032Jj9 A0L = C18210wN.A0L(this.mUserSession);
        final boolean z9 = z;
        final boolean z10 = z2;
        final boolean z11 = z3;
        final boolean z12 = z4;
        final boolean z13 = z5;
        final boolean z14 = z6;
        final boolean z15 = z7;
        final boolean z16 = z8;
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final String str8 = str4;
        return new View.OnClickListener() {
            /* JADX WARNING: type inference failed for: r2v3, types: [X.BzM, com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x0097  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x00cc  */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r10) {
                /*
                    r9 = this;
                    r0 = -2012922685(0xffffffff88053cc3, float:-4.0094657E-34)
                    int r3 = X.C14030oh.A05(r0)
                    java.lang.String r0 = r2
                    if (r0 == 0) goto L_0x0011
                    X.Jj9 r1 = r3
                    java.lang.String r0 = "My Title"
                    r1.A0O = r0
                L_0x0011:
                    java.lang.String r0 = r4
                    if (r0 == 0) goto L_0x001b
                    X.Jj9 r1 = r3
                    java.lang.String r0 = "My subtitle"
                    r1.A0N = r0
                L_0x001b:
                    boolean r0 = r5
                    java.lang.String r2 = "Done"
                    r4 = 1
                    if (r0 == 0) goto L_0x0032
                    X.Jj9 r1 = r3
                    r1.A0R = r2
                    r1.A0W = r4
                    boolean r0 = r6
                    if (r0 == 0) goto L_0x0032
                    java.lang.String r0 = "Cancel"
                    r1.A0S = r0
                    r1.A0X = r4
                L_0x0032:
                    boolean r0 = r7
                    if (r0 == 0) goto L_0x004b
                    java.lang.String r0 = r8
                    X.Jj9 r6 = r3
                    X.17a r5 = new X.17a
                    if (r0 == 0) goto L_0x0109
                    r5.<init>()
                    java.lang.String r0 = r8
                    r5.A06 = r0
                L_0x0045:
                    X.JPd r0 = r5.A01()
                    r6.A0F = r0
                L_0x004b:
                    boolean r1 = r9
                    java.lang.String r7 = "Shopping cart"
                    r8 = 99
                    java.lang.String r0 = r10
                    if (r1 == 0) goto L_0x00fc
                    java.lang.String r1 = "More Options"
                    if (r0 == 0) goto L_0x00d2
                    X.Jj9 r6 = r3
                    X.17a r5 = new X.17a
                    r5.<init>()
                    r0 = 2131232817(0x7f080831, float:1.8081754E38)
                    r5.A01 = r0
                    r5.A06 = r1
                L_0x0067:
                    r5.A0A = r4
                    X.JPd r0 = r5.A01()
                    r6.A0G = r0
                L_0x006f:
                    boolean r0 = r12
                    if (r0 == 0) goto L_0x0093
                    X.Jj9 r6 = r3
                    X.17a r5 = new X.17a
                    r5.<init>()
                    com.instagram.debug.devoptions.igds.IgdsBottomSheetExamplesFragment r0 = com.instagram.debug.devoptions.igds.IgdsBottomSheetExamplesFragment.this
                    android.content.Context r2 = r0.mContext
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                    X.4xp r0 = new X.4xp
                    r0.<init>(r2, r1)
                    r5.A03 = r0
                    r5.A07 = r7
                    r5.A0A = r4
                    X.JPd r0 = r5.A01()
                    r6.A0H = r0
                L_0x0093:
                    boolean r0 = r13
                    if (r0 == 0) goto L_0x009c
                    X.Jj9 r0 = r3
                    X.C18250wR.A1B(r0, r4)
                L_0x009c:
                    boolean r0 = r14
                    if (r0 == 0) goto L_0x00cc
                    com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment r2 = new com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment
                    r2.<init>()
                    X.Jj9 r0 = r3
                    r0.A0I = r2
                L_0x00a9:
                    X.Jj9 r0 = r3
                    X.Jqm r1 = r0.A00()
                    boolean r0 = r5
                    if (r0 == 0) goto L_0x00ba
                    boolean r0 = r6
                    if (r0 == 0) goto L_0x00c8
                    r1.A0J(r4, r4)
                L_0x00ba:
                    com.instagram.debug.devoptions.igds.IgdsBottomSheetExamplesFragment r0 = com.instagram.debug.devoptions.igds.IgdsBottomSheetExamplesFragment.this
                    android.content.Context r0 = r0.mContext
                    X.C37383Jqm.A00(r0, r2, r1)
                    r0 = -1088282665(0xffffffffbf221fd7, float:-0.63329834)
                    X.C14030oh.A0C(r0, r3)
                    return
                L_0x00c8:
                    r1.A0I(r4)
                    goto L_0x00ba
                L_0x00cc:
                    com.instagram.debug.devoptions.igds.IgdsDummyDebugFragment r2 = new com.instagram.debug.devoptions.igds.IgdsDummyDebugFragment
                    r2.<init>()
                    goto L_0x00a9
                L_0x00d2:
                    boolean r0 = r11
                    X.Jj9 r6 = r3
                    X.17a r5 = new X.17a
                    if (r0 == 0) goto L_0x00f0
                    r5.<init>()
                    com.instagram.debug.devoptions.igds.IgdsBottomSheetExamplesFragment r0 = com.instagram.debug.devoptions.igds.IgdsBottomSheetExamplesFragment.this
                    android.content.Context r2 = r0.mContext
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                    X.4xp r0 = new X.4xp
                    r0.<init>(r2, r1)
                    r5.A03 = r0
                    r5.A07 = r7
                    goto L_0x0067
                L_0x00f0:
                    r5.<init>()
                    r0 = 2131232817(0x7f080831, float:1.8081754E38)
                    r5.A02 = r0
                    r5.A07 = r1
                    goto L_0x0067
                L_0x00fc:
                    if (r0 == 0) goto L_0x006f
                    X.Jj9 r6 = r3
                    X.17a r5 = new X.17a
                    r5.<init>()
                    r5.A06 = r2
                    goto L_0x0067
                L_0x0109:
                    r5.<init>()
                    r0 = 2131232258(0x7f080602, float:1.808062E38)
                    r5.A02 = r0
                    com.instagram.debug.devoptions.igds.IgdsBottomSheetExamplesFragment r0 = com.instagram.debug.devoptions.igds.IgdsBottomSheetExamplesFragment.this
                    android.content.Context r1 = r0.mContext
                    r0 = 2131821803(0x7f1104eb, float:1.927636E38)
                    java.lang.String r1 = r1.getString(r0)
                    r0 = 0
                    X.C04220Ms.A0B(r1, r0)
                    r5.A07 = r1
                    goto L_0x0045
                */
                throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.igds.IgdsBottomSheetExamplesFragment.AnonymousClass1.onClick(android.view.View):void");
            }
        };
    }

    public String getModuleName() {
        return "igds_bottom_sheet_examples";
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    private void setAndCreateItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A01("IGDS Bottom Sheet Configuration", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, false, false, false, false, false, false, TITLE, (String) null, (String) null, (String) null), "With title only", A0v);
        AnonymousClass4MA.A02(getClickListener(false, true, false, false, false, false, false, false, TITLE, (String) null, (String) null, (String) null), "Fullscreen enabled with title only", A0v);
        String str = TITLE;
        AnonymousClass4MA.A02(getClickListener(true, true, false, false, false, false, false, false, str, (String) null, (String) null, (String) null), "Fullscreen enabled with title only and long content", A0v);
        AnonymousClass4MA.A02(getClickListener(true, true, false, true, true, false, false, false, str, (String) null, (String) null, (String) null), "Fullscreen enabled with long content and bottom buttons", A0v);
        String str2 = TITLE;
        AnonymousClass4MA.A02(getClickListener(false, false, true, false, false, false, false, false, str2, (String) null, BACK_TEXT, DONE_TEXT), "With title and text buttons", A0v);
        AnonymousClass4MA.A02(getClickListener(true, false, true, false, false, false, false, false, str, (String) null, BACK_TEXT, DONE_TEXT), "With title and text buttons and long content", A0v);
        String str3 = TITLE;
        AnonymousClass4MA.A02(getClickListener(false, false, false, false, false, false, false, false, str3, SUBTITLE, (String) null, (String) null), "With title and subtitle", A0v);
        AnonymousClass4MA.A02(getClickListener(false, true, true, false, false, false, false, false, str2, SUBTITLE, BACK_TEXT, DONE_TEXT), "Fullscreen enabled with title, subtitle, and text buttons", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, true, false, false, false, false, false, (String) null, (String) null, BACK_TEXT, DONE_TEXT), "With only text buttons", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, true, false, false, false, false, false, (String) null, (String) null, BACK_TEXT, (String) null), "With only left text button", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, false, false, false, false, false, false, (String) null, (String) null, (String) null, DONE_TEXT), "With only right text button", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, true, false, false, false, false, false, (String) null, (String) null, (String) null, (String) null), "With only left icon", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, false, false, false, true, false, false, (String) null, (String) null, (String) null, (String) null), "With only right icon", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, false, false, false, true, false, false, (String) null, (String) null, (String) null, MORE_TEXT), "With right text and drawable", A0v);
        String str4 = TITLE;
        AnonymousClass4MA.A02(getClickListener(false, false, true, false, false, false, false, false, str4, (String) null, (String) null, (String) null), "With title and only left icon", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, false, false, false, true, false, false, str4, (String) null, (String) null, (String) null), "With title and only right icon", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, false, false, false, true, false, false, TITLE, (String) null, (String) null, MORE_TEXT), "With title and right text and drawable", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, true, false, false, true, false, false, (String) null, (String) null, (String) null, (String) null), "With only left and right icons", A0v);
        String str5 = TITLE;
        AnonymousClass4MA.A02(getClickListener(false, false, true, false, false, true, false, false, str5, (String) null, (String) null, (String) null), "With title and left and right icons", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, true, false, false, true, false, false, str5, (String) null, (String) null, (String) null), "With title and left icon and right drawable with text", A0v);
        String str6 = LONG_TEXT;
        String str7 = LONG_TEXT;
        AnonymousClass4MA.A02(getClickListener(false, false, true, false, false, false, false, false, LONG_TEXT, (String) null, str6, str7), "With truncated title and truncated text buttons", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, true, false, false, true, false, false, LONG_TEXT, (String) null, (String) null, str7), "With truncated title and icon buttons with text", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, false, true, false, false, false, false, str5, (String) null, (String) null, (String) null), "With title and primary button", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, false, true, true, false, false, false, str5, (String) null, (String) null, (String) null), "With title and primary and secondary buttons", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, false, false, false, true, true, false, TITLE, SUBTITLE, BACK_TEXT, (String) null), "With title, subtitle, text left button, and large right icon button", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, true, false, false, true, false, true, str3, (String) null, (String) null, (String) null), "With title, left icon, secondary right button, and right button", A0v);
        setItems(A0v);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131825231);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(542597608);
        super.onCreate(bundle);
        this.mUserSession = AnonymousClass0wJ.A0W(this);
        this.mContext = requireContext();
        C14030oh.A09(-156553697, A02);
    }

    public void onResume() {
        int A02 = C14030oh.A02(-1876331242);
        super.onResume();
        setAndCreateItems();
        C14030oh.A09(1338487817, A02);
    }
}
