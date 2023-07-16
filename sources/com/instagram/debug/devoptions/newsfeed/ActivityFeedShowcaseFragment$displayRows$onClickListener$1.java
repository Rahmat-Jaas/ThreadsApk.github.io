package com.instagram.debug.devoptions.newsfeed;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass4VZ;
import X.AnonymousClass8bQ;
import X.C18200wM;
import X.C23909D0x;
import X.C27709Erz;
import X.C63813iO;
import X.C86114wI;
import android.content.Context;
import android.view.View;

public final class ActivityFeedShowcaseFragment$displayRows$onClickListener$1 implements C27709Erz {
    public final /* synthetic */ Context $context;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C23909D0x.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[5] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ActivityFeedShowcaseFragment$displayRows$onClickListener$1(Context context) {
        this.$context = context;
    }

    public final void onClick(View view, C23909D0x d0x) {
        String str;
        String str2;
        boolean A1Y = AnonymousClass0wJ.A1Y(view, d0x);
        switch (d0x.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
                str = null;
                str2 = AnonymousClass00U.A0L(AnonymousClass8bQ.A0l(C86114wI.A0o(d0x.toString()), "_", " ", A1Y), " clicked");
                break;
            case 5:
                view.setSelected(!view.isSelected());
                StringBuilder A0r = C18200wM.A0r();
                str = null;
                A0r.append(AnonymousClass8bQ.A0l(C86114wI.A0o(d0x.toString()), "_", " ", A1Y));
                A0r.append(" clicked, value = ");
                A0r.append(view.isSelected());
                str2 = A0r.toString();
                break;
            default:
                throw AnonymousClass4VZ.A00();
        }
        C63813iO.A02(this.$context, str2, str, A1Y ? 1 : 0);
    }
}
