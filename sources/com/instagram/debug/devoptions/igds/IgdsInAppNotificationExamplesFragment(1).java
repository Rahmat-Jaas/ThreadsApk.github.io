package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C14030oh;
import X.C23411dm;
import X.C63613hu;
import X.C82034oy;
import X.GDS;
import X.GDT;
import X.H5O;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

public class IgdsInAppNotificationExamplesFragment extends C23411dm implements C82034oy {
    public static final String LONG_MESSAGE = "Hey, this is a fairly long placeholder message that should span at least one or two lines.";
    public static final String NOTIFICATION_SOURCE = "Example Notification Source";
    public static final String SHORT_MESSAGE = "Short message";
    public static final String TITLE = "username or title";
    public Context mContext;
    public ImageUrl mImageUrl;
    public UserSession mUserSession;

    public String getModuleName() {
        return "igds_notification_examples";
    }

    private View.OnClickListener getClickListener(final String str, final boolean z) {
        return new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = C14030oh.A05(-429745990);
                GDS gds = new GDS();
                if (true) {
                    gds.A01 = IgdsInAppNotificationExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                }
                H5O A01 = H5O.A01();
                gds.A09 = IgdsInAppNotificationExamplesFragment.LONG_MESSAGE;
                gds.A0B = IgdsInAppNotificationExamplesFragment.TITLE;
                gds.A02 = IgdsInAppNotificationExamplesFragment.this.mImageUrl;
                gds.A0A = IgdsInAppNotificationExamplesFragment.NOTIFICATION_SOURCE;
                A01.A08(new GDT(gds));
                C14030oh.A0C(53910216, A05);
            }
        };
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    private void setAndCreateItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A01("IGDS In-App Notification Configuration", A0v);
        AnonymousClass4MA.A02(new View.OnClickListener(false, SHORT_MESSAGE) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(-429745990);
                GDS gds = new GDS();
                if (true) {
                    gds.A01 = IgdsInAppNotificationExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                }
                H5O A01 = H5O.A01();
                gds.A09 = IgdsInAppNotificationExamplesFragment.LONG_MESSAGE;
                gds.A0B = IgdsInAppNotificationExamplesFragment.TITLE;
                gds.A02 = IgdsInAppNotificationExamplesFragment.this.mImageUrl;
                gds.A0A = IgdsInAppNotificationExamplesFragment.NOTIFICATION_SOURCE;
                A01.A08(new GDT(gds));
                C14030oh.A0C(53910216, A05);
            }
        }, "Short message without additional media", A0v);
        AnonymousClass4MA.A02(new View.OnClickListener(true, SHORT_MESSAGE) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(-429745990);
                GDS gds = new GDS();
                if (true) {
                    gds.A01 = IgdsInAppNotificationExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                }
                H5O A01 = H5O.A01();
                gds.A09 = IgdsInAppNotificationExamplesFragment.LONG_MESSAGE;
                gds.A0B = IgdsInAppNotificationExamplesFragment.TITLE;
                gds.A02 = IgdsInAppNotificationExamplesFragment.this.mImageUrl;
                gds.A0A = IgdsInAppNotificationExamplesFragment.NOTIFICATION_SOURCE;
                A01.A08(new GDT(gds));
                C14030oh.A0C(53910216, A05);
            }
        }, "Short message with additional media", A0v);
        AnonymousClass4MA.A02(new View.OnClickListener(false, LONG_MESSAGE) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(-429745990);
                GDS gds = new GDS();
                if (true) {
                    gds.A01 = IgdsInAppNotificationExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                }
                H5O A01 = H5O.A01();
                gds.A09 = IgdsInAppNotificationExamplesFragment.LONG_MESSAGE;
                gds.A0B = IgdsInAppNotificationExamplesFragment.TITLE;
                gds.A02 = IgdsInAppNotificationExamplesFragment.this.mImageUrl;
                gds.A0A = IgdsInAppNotificationExamplesFragment.NOTIFICATION_SOURCE;
                A01.A08(new GDT(gds));
                C14030oh.A0C(53910216, A05);
            }
        }, "Long message without additional media", A0v);
        AnonymousClass4MA.A02(new View.OnClickListener(true, LONG_MESSAGE) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(-429745990);
                GDS gds = new GDS();
                if (true) {
                    gds.A01 = IgdsInAppNotificationExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                }
                H5O A01 = H5O.A01();
                gds.A09 = IgdsInAppNotificationExamplesFragment.LONG_MESSAGE;
                gds.A0B = IgdsInAppNotificationExamplesFragment.TITLE;
                gds.A02 = IgdsInAppNotificationExamplesFragment.this.mImageUrl;
                gds.A0A = IgdsInAppNotificationExamplesFragment.NOTIFICATION_SOURCE;
                A01.A08(new GDT(gds));
                C14030oh.A0C(53910216, A05);
            }
        }, "Long message with additional media", A0v);
        setItems(A0v);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131825246);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(2056789822);
        super.onCreate(bundle);
        this.mUserSession = AnonymousClass0wJ.A0W(this);
        this.mContext = requireContext();
        this.mImageUrl = AnonymousClass0wJ.A0Y(this.mUserSession).B4M();
        C14030oh.A09(1168377976, A02);
    }

    public void onResume() {
        int A02 = C14030oh.A02(198806466);
        super.onResume();
        setAndCreateItems();
        C14030oh.A09(244822616, A02);
    }
}
