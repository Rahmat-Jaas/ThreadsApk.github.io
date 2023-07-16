package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass22b;
import X.C04220Ms;
import X.C06810aP;
import X.C14030oh;
import X.C306022c;
import X.C63733iD;
import X.E2V;
import android.view.View;
import android.widget.ImageView;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;

public final class IgdsSnackbarStyleExamplesFragment$getClickListener$1 implements View.OnClickListener {
    public final /* synthetic */ boolean $boldText;
    public final /* synthetic */ int $buttonIconRes;
    public final /* synthetic */ String $buttonText;
    public final /* synthetic */ String $category;
    public final /* synthetic */ AnonymousClass22b $imageType;
    public final /* synthetic */ boolean $isStackedAvatar;
    public final /* synthetic */ String $messageDescription;
    public final /* synthetic */ String $messageText;
    public final /* synthetic */ boolean $showPresenceIndicator;
    public final /* synthetic */ boolean $stayLonger;
    public final /* synthetic */ C306022c $style;
    public final /* synthetic */ IgdsSnackbarStyleExamplesFragment this$0;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnonymousClass22b.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IgdsSnackbarStyleExamplesFragment$getClickListener$1(C306022c r1, String str, IgdsSnackbarStyleExamplesFragment igdsSnackbarStyleExamplesFragment, String str2, String str3, String str4, int i, AnonymousClass22b r8, boolean z, boolean z2, boolean z3, boolean z4) {
        this.$style = r1;
        this.$messageText = str;
        this.this$0 = igdsSnackbarStyleExamplesFragment;
        this.$messageDescription = str2;
        this.$buttonText = str3;
        this.$category = str4;
        this.$buttonIconRes = i;
        this.$imageType = r8;
        this.$isStackedAvatar = z;
        this.$showPresenceIndicator = z2;
        this.$boldText = z3;
        this.$stayLonger = z4;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1671820343);
        C63733iD A01 = C63733iD.A01();
        C306022c r2 = this.$style;
        String str = this.$messageText;
        IgdsSnackbarStyleExamplesFragment igdsSnackbarStyleExamplesFragment = this.this$0;
        String str2 = this.$messageDescription;
        String str3 = this.$buttonText;
        String str4 = this.$category;
        int i = this.$buttonIconRes;
        AnonymousClass22b r1 = this.$imageType;
        boolean z = this.$isStackedAvatar;
        boolean z2 = this.$showPresenceIndicator;
        boolean z3 = this.$boldText;
        boolean z4 = this.$stayLonger;
        A01.A0F(r2);
        A01.A0A = str;
        ImageView imageView = E2V.A03(igdsSnackbarStyleExamplesFragment.getRootActivity()).A0P;
        C04220Ms.A06(imageView);
        A01.A0K = true;
        A01.A04 = imageView;
        A01.A0F = str2;
        if (str3 != null) {
            A01.A0D = str3;
            A01.A07 = new IgdsSnackbarStyleExamplesFragment$getClickListener$1$config$1$1$1();
            A01.A0I = true;
        }
        if (str4 != null) {
            A01.A0E = str4;
        }
        if (i != 0) {
            A01.A00 = i;
            A01.A07 = new IgdsSnackbarStyleExamplesFragment$getClickListener$1$config$1$3();
            A01.A0I = true;
        }
        A01.A0E(r1);
        int ordinal = r1.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            A01.A06 = C06810aP.A01.A01(AnonymousClass0wJ.A0X(igdsSnackbarStyleExamplesFragment.userSession$delegate)).B4M();
        } else if (ordinal == 3) {
            ImageUrl B4M = C06810aP.A01.A01(AnonymousClass0wJ.A0X(igdsSnackbarStyleExamplesFragment.userSession$delegate)).B4M();
            A01.A06 = B4M;
            if (z) {
                A01.A05 = B4M;
            }
            if (z2) {
                A01.A0L = true;
            }
        } else if (ordinal == 4) {
            A01.A0B = Integer.valueOf(R.drawable.instagram_star_pano_outline_24);
        }
        if (z3) {
            A01.A0J = true;
        }
        if (z4) {
            A01.A0C();
        }
        C63733iD.A0A(A01);
        C14030oh.A0C(-952144955, A05);
    }
}
