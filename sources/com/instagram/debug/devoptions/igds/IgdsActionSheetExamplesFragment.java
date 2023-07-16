package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C14030oh;
import X.C23411dm;
import X.C58963Iu;
import X.C62763ag;
import X.C63063bP;
import X.C63613hu;
import X.C82034oy;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

public class IgdsActionSheetExamplesFragment extends C23411dm implements C82034oy {
    public static final String ACTION_TEXT = "Test Action";
    public static final String HEADER_TEXT = "Header for Action Sheet";
    public static final String LONG_TEXT = "Very long meaningless string that spans multiple lines and should be truncated";
    public static final String SUBTITLE_TEXT = "Subtitle for Action Sheet";
    public static ImageUrl mImageUrl;
    public Context mContext;
    public UserSession mUserSession;

    public String getModuleName() {
        return "igds_action_sheet_examples";
    }

    private View.OnClickListener getClickListener(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2) {
        final String str;
        final String str2 = LONG_TEXT;
        if (z6) {
            str = str2;
        } else {
            str = ACTION_TEXT;
            str2 = SUBTITLE_TEXT;
        }
        final AnonymousClass1 r9 = new View.OnClickListener() {
            public void onClick(View view) {
                C14030oh.A0C(2063570213, C14030oh.A05(-90998190));
            }
        };
        final boolean z7 = z;
        final boolean z8 = z2;
        final boolean z9 = z3;
        final boolean z10 = z4;
        final boolean z11 = z5;
        final int i3 = i;
        final int i4 = i2;
        return new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = C14030oh.A05(923319994);
                C58963Iu r5 = new C58963Iu(IgdsActionSheetExamplesFragment.this.mUserSession);
                boolean z = z8;
                boolean z2 = z10;
                if (z) {
                    if (z2) {
                        boolean z3 = z11;
                        String str = str2;
                        if (z3) {
                            r5.A03 = new C63613hu(IgdsActionSheetExamplesFragment.HEADER_TEXT, str, "Linked on Jan 10, 2020");
                        } else {
                            r5.A0A(IgdsActionSheetExamplesFragment.HEADER_TEXT, str);
                        }
                    } else {
                        r5.A06(IgdsActionSheetExamplesFragment.HEADER_TEXT);
                    }
                } else if (z2) {
                    r5.A07(str2);
                }
                if (z7) {
                    r5.A05(IgdsActionSheetExamplesFragment.mImageUrl);
                }
                if (z9) {
                    String str2 = str;
                    r5.A05.add(new C63063bP(r9, str2, R.color.igds_primary_button));
                }
                for (int i = 0; i < i4; i++) {
                    r5.A08(str, r9);
                }
                for (int i2 = 0; i2 < i3; i2++) {
                    r5.A09(IgdsActionSheetExamplesFragment.ACTION_TEXT, r9);
                }
                new C62763ag(r5).A04(IgdsActionSheetExamplesFragment.this.mContext);
                C14030oh.A0C(-52983144, A05);
            }
        };
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    private void setAndCreateItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A01("IGDS Action Sheet Configuration", A0v);
        AnonymousClass4MA.A02(getClickListener(false, true, false, false, false, false, 1, 0), "Header and regular action", A0v);
        AnonymousClass4MA.A02(getClickListener(true, true, false, false, false, false, 1, 0), "Photo, header and regular action", A0v);
        AnonymousClass4MA.A02(getClickListener(false, true, false, false, false, false, 2, 2), "Header and regular and destructive actions", A0v);
        AnonymousClass4MA.A02(getClickListener(false, true, true, true, false, true, 3, 2), "Header, subheader and multiple truncated action labels", A0v);
        AnonymousClass4MA.A02(getClickListener(true, true, true, true, false, true, 3, 2), "Photo, header, subheader and multiple truncated action labels", A0v);
        AnonymousClass4MA.A02(getClickListener(false, true, true, true, false, false, 0, 0), "Header and subtitle", A0v);
        AnonymousClass4MA.A02(getClickListener(true, true, true, true, false, false, 0, 0), "Photo, header and subtitle", A0v);
        AnonymousClass4MA.A02(getClickListener(false, true, true, true, true, false, 0, 0), "Header, subtitle and info", A0v);
        AnonymousClass4MA.A02(getClickListener(true, true, true, true, true, false, 0, 0), "Photo, header, subtitle and info", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, true, true, false, false, 0, 0), IgdsTextCellExamplesFragment.SUBTITLE, A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, false, false, false, false, 0, 1), "One destructive action", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, false, false, false, false, 1, 0), "One regular action", A0v);
        AnonymousClass4MA.A02(getClickListener(false, false, true, false, false, false, 0, 0), "One primary action", A0v);
        setItems(A0v);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131825227);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1118509121);
        super.onCreate(bundle);
        this.mUserSession = AnonymousClass0wJ.A0W(this);
        this.mContext = requireContext();
        mImageUrl = AnonymousClass0wJ.A0Y(this.mUserSession).B4M();
        C14030oh.A09(1816308799, A02);
    }

    public void onResume() {
        int A02 = C14030oh.A02(844138196);
        super.onResume();
        setAndCreateItems();
        C14030oh.A09(-666375492, A02);
    }
}
