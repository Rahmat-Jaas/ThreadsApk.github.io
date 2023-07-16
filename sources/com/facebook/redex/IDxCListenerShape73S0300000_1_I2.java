package com.facebook.redex;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass1p5;
import X.AnonymousClass1p6;
import X.AnonymousClass1wZ;
import X.AnonymousClass3EX;
import X.AnonymousClass3HX;
import X.AnonymousClass3VO;
import X.AnonymousClass47x;
import X.AnonymousClass7K8;
import X.C109326jp;
import X.C122047Jt;
import X.C127397h3;
import X.C18190wL;
import X.C18230wP;
import X.C22471Yf;
import X.C23071bs;
import X.C25745DrH;
import X.C28161tl;
import X.C62423Zt;
import X.C63893iY;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.CompoundButton;
import com.instagram.bugreporter.BugReportSevereSwitchView;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.service.session.UserSession;

public class IDxCListenerShape73S0300000_1_I2 implements CompoundButton.OnCheckedChangeListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape73S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        boolean z2;
        SharedPreferences.Editor editor;
        String str2;
        switch (this.A03) {
            case 0:
                C127397h3 r3 = (C127397h3) this.A01;
                C63893iY A05 = C63893iY.A05(AnonymousClass3VO.A00(), r3, 0);
                C122047Jt.A03((AnonymousClass3HX) this.A00, r3, A05, (C109326jp) this.A02);
                return;
            case 1:
                if (z) {
                    str = "on";
                } else {
                    str = "off";
                }
                C127397h3 r4 = (C127397h3) this.A02;
                C109326jp A0V = C18230wP.A0V(r4);
                if (A0V != null) {
                    AnonymousClass3VO A002 = AnonymousClass3VO.A00();
                    A002.A03(r4, 0);
                    A002.A03(str, 1);
                    AnonymousClass3HX r1 = (AnonymousClass3HX) this.A01;
                    C122047Jt.A03(r1, r4, C63893iY.A04(A002, r1, 2), A0V);
                    return;
                }
                return;
            case 2:
                if (z) {
                    ((BugReportSevereSwitchView) this.A02).A01((AnonymousClass3EX) this.A00, (UserSession) this.A01, z);
                    return;
                }
                return;
            case 3:
                ((View) this.A00).setVisibility(C18190wL.A00(z ? 1 : 0));
                C23071bs.A00((C23071bs) this.A02).A03 = z;
                ((IgdsListCell) this.A01).setChecked(z);
                return;
            case 4:
                C22471Yf r32 = (C22471Yf) this.A02;
                if (r32.isResumed()) {
                    if (z) {
                        ((AnonymousClass0YP) this.A00).invoke(r32.A03, this.A01);
                    }
                    if (r32 instanceof AnonymousClass1p5) {
                        z2 = false;
                    } else {
                        z2 = ((AnonymousClass1p6) r32).A04;
                    }
                    C25745DrH A0a = C18230wP.A0a(r32);
                    if (z2) {
                        if (A0a != null) {
                            A0a.A0C();
                            return;
                        }
                        return;
                    } else if (A0a != null) {
                        A0a.A0I();
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                AnonymousClass1wZ r6 = (AnonymousClass1wZ) this.A00;
                Activity rootActivity = r6.getRootActivity();
                boolean A032 = AnonymousClass7K8.A03(rootActivity, "android.permission.WRITE_EXTERNAL_STORAGE");
                if (!z) {
                    int A04 = AnonymousClass0wJ.A04(this.A01);
                    if (A04 == 0) {
                        C62423Zt.A02(r6.A00);
                        editor = C28161tl.A02((C28161tl) this.A02);
                        str2 = "save_original_photos";
                    } else if (A04 == 1) {
                        editor = C28161tl.A02((C28161tl) this.A02);
                        str2 = "save_posted_photos";
                    } else if (A04 == 2) {
                        AnonymousClass1wZ.A0B(r6, false);
                        return;
                    } else {
                        return;
                    }
                    AnonymousClass0wJ.A13(editor, str2, false);
                    return;
                }
                AnonymousClass7K8.A02(rootActivity, new AnonymousClass47x(rootActivity, this, A032), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
                return;
        }
    }
}
