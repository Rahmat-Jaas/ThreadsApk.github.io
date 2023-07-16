package com.instagram.debug.devoptions.modernarchitecture;

import X.AnonymousClass006;
import X.AnonymousClass0OY;
import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass3W9;
import X.AnonymousClass534;
import X.AnonymousClass6QP;
import X.AnonymousClass6QR;
import X.AnonymousClass74X;
import X.AnonymousClass7Ak;
import X.AnonymousClass7DE;
import X.AnonymousClass7GN;
import X.AnonymousClass7HZ;
import X.AnonymousClass7I9;
import X.AnonymousClass7JP;
import X.AnonymousClass7JR;
import X.AnonymousClass7K4;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7V5;
import X.AnonymousClass7V9;
import X.AnonymousClass7VA;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.AnonymousClass7WR;
import X.AnonymousClass7WY;
import X.C04530Oa;
import X.C114236su;
import X.C115696vl;
import X.C1190173e;
import X.C1203679w;
import X.C1203779x;
import X.C120537Bh;
import X.C121117Ee;
import X.C121807If;
import X.C123327Wm;
import X.C134817yQ;
import X.C14030oh;
import X.C142708fS;
import X.C142878fk;
import X.C145058jl;
import X.C146288ly;
import X.C147178nW;
import X.C147188nY;
import X.C147368pE;
import X.C18210wN;
import X.C18220wO;
import X.C34640IcN;
import X.C86104wH;
import X.C97906Dk;
import X.C98236Es;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel;
import com.instagram.service.session.UserSession;
import java.util.List;

public final class RepositoryInfoFragment extends C34640IcN {
    public static final int $stable = 8;
    public final C04530Oa session$delegate = AnonymousClass3W9.A00(this);
    public final C04530Oa viewModel$delegate;

    /* access modifiers changed from: private */
    public final void MemoryCacheStats(RepositoryInfoViewModel.MemoryCacheStats memoryCacheStats, Modifier modifier, C147188nY r15, int i, int i2) {
        Modifier modifier2 = modifier;
        C147188nY r5 = r15;
        r15.Cvd(92384386);
        int i3 = i2;
        if ((i2 & 2) != 0) {
            modifier2 = Modifier.A00;
        }
        RepositoryInfoViewModel.MemoryCacheStats memoryCacheStats2 = memoryCacheStats;
        ExpandableColumn("Memory Cache", (Modifier) null, AnonymousClass7JR.A00(r15, new RepositoryInfoFragment$MemoryCacheStats$1(memoryCacheStats, modifier2), 238705467), r5, 4486, 2);
        C147178nW AKE = r15.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new RepositoryInfoFragment$MemoryCacheStats$2(this, memoryCacheStats2, modifier2, i, i3));
        }
    }

    /* access modifiers changed from: private */
    public final void RepositoryItem(RepositoryInfoViewModel.RepositoryInfo repositoryInfo, Modifier modifier, C147188nY r16, int i, int i2) {
        Modifier modifier2 = modifier;
        C147188nY r6 = r16;
        r6.Cvd(320055229);
        int i3 = i2;
        if ((i2 & 2) != 0) {
            modifier2 = Modifier.A00;
        }
        RepositoryInfoViewModel.RepositoryInfo repositoryInfo2 = repositoryInfo;
        ExpandableColumn(repositoryInfo.name, (Modifier) null, AnonymousClass7JR.A00(r6, new RepositoryInfoFragment$RepositoryItem$1(repositoryInfo, modifier2, this), 1264229110), r6, 4480, 2);
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new RepositoryInfoFragment$RepositoryItem$2(this, repositoryInfo2, modifier2, i, i3));
        }
    }

    public String getModuleName() {
        return "repository_info";
    }

    /* access modifiers changed from: private */
    public final void ExpandableColumn(String str, Modifier modifier, AnonymousClass0YP r52, C147188nY r53, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r0 = r53;
        r0.Cvd(351735581);
        int i4 = i2;
        String str2 = str;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r0, str2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r0, modifier2);
        }
        AnonymousClass0YP r48 = r52;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0B(r0, r48);
        }
        if ((i3 & 731) != 146 || !r0.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r0;
            Object A13 = r3.A13();
            Object obj = AnonymousClass7GN.A00;
            if (A13 == obj) {
                A13 = AnonymousClass7WR.A00(r3, false);
            }
            C147368pE r2 = (C147368pE) A13;
            C123327Wm A00 = Modifier.A00(r0);
            C146288ly A04 = AnonymousClass7KV.A04(r0);
            AnonymousClass534 A0a = C147188nY.A0a(r0);
            Object AEA = r0.AEA(A0a);
            AnonymousClass534 r11 = AnonymousClass7DE.A07;
            Object AEA2 = r0.AEA(r11);
            AnonymousClass534 r10 = AnonymousClass7DE.A0B;
            Object AEA3 = r0.AEA(r10);
            AnonymousClass0ZU r15 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A00);
            C147188nY.A0w(r0, r3, r15);
            r3.A0T = false;
            AnonymousClass0YP r9 = AnonymousClass74X.A03;
            AnonymousClass0YP A003 = AnonymousClass7Ak.A00(r0, A04, AEA, r9);
            AnonymousClass0YP r8 = AnonymousClass74X.A02;
            AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r0, AEA2, r8);
            Integer A05 = AnonymousClass7KP.A05(r0, AEA3, A01, A002);
            r0.Cvb(2058660585);
            AnonymousClass7V5 r39 = AnonymousClass7V5.A00;
            r0.Cvb(1497720723);
            boolean A0y = C147188nY.A0y(r0, r2);
            Object A132 = r3.A13();
            if (A0y || A132 == obj) {
                A132 = new RepositoryInfoFragment$ExpandableColumn$1$1$1(r2);
                r3.A14(A132);
            }
            Modifier A03 = AnonymousClass7HZ.A03(A00, AnonymousClass7W3.A08(r3, A132, false), false);
            C146288ly A06 = AnonymousClass7KV.A06(r0);
            Object A0s = C147188nY.A0s(r0, A0a);
            Object AEA4 = r0.AEA(r11);
            Object AEA5 = r0.AEA(r10);
            AnonymousClass0YM A004 = C98236Es.A00(A03);
            C147188nY.A0w(r0, r3, r15);
            r3.A0T = false;
            AnonymousClass7Ak.A02(r0, A06, r9);
            AnonymousClass7Ak.A02(r0, A0s, A003);
            A004.invoke(AnonymousClass7KP.A03(r0, AEA4, AEA5, r8, A01), r0, A05);
            r0.Cvb(2058660585);
            AnonymousClass7VA r7 = AnonymousClass7VA.A00;
            r0.Cvb(649408503);
            boolean A1X = C86104wH.A1X(r2);
            int i7 = R.drawable.instagram_chevron_right_pano_outline_16;
            if (A1X) {
                i7 = R.drawable.instagram_chevron_down_outline_16;
            }
            C147188nY r28 = r0;
            C1190173e.A00(r28, r7.A00(AnonymousClass7KV.A04, A00), AnonymousClass6QP.A00(r0, i7), "icon to signify whether the row item is expanded", 56, 8, 0);
            AnonymousClass7I9.A02(r0, AnonymousClass7K4.A08(modifier2, 4), (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 0, 0, i3 & 14, 0, 4092, 0, 0, false);
            boolean A11 = AnonymousClass7W3.A11(r3);
            C147188nY r40 = r0;
            AnonymousClass7JP.A05((C1203679w) null, (C1203779x) null, r39, r40, C97906Dk.A00(modifier2, (float) 20, (float) 0), (String) null, AnonymousClass7JR.A00(r0, new RepositoryInfoFragment$ExpandableColumn$1$3(r48, i3), 218416235), 1572870, 28, C86104wH.A1X(r2));
            AnonymousClass7W3.A0v(r3, A11);
        } else {
            r0.CuJ();
        }
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new RepositoryInfoFragment$ExpandableColumn$2(this, str2, modifier2, r48, i5, i4));
        }
    }

    /* access modifiers changed from: private */
    public final void Header(Modifier modifier, C147188nY r26, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r6 = r26;
        r6.Cvd(-1556569945);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r6, modifier2) | i;
        } else {
            i3 = i6;
        }
        if ((i3 & 11) != 2 || !r6.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            AnonymousClass7I9.A02(r6, modifier2, C120537Bh.A02(r6).A05, (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), "UserSession scoped Repositories", 0, 0, 0, ((i3 << 3) & 112) | 6, 0, 1976, C120537Bh.A00(r6).A0F, 0, false);
        } else {
            r6.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new RepositoryInfoFragment$Header$1(this, modifier2, i6, i4));
        }
    }

    /* access modifiers changed from: private */
    public final void RepositoryList(List list, Modifier modifier, C147188nY r22, int i, int i2) {
        Modifier modifier2 = modifier;
        C147188nY r6 = r22;
        r6.Cvd(740535000);
        int i3 = i2;
        if ((i2 & 2) != 0) {
            modifier2 = Modifier.A00;
        }
        float f = (float) 4;
        float f2 = (float) 0;
        List list2 = list;
        int i4 = i;
        C115696vl.A01((C142708fS) null, (C145058jl) null, new AnonymousClass7V9(f2, f, f2, f), (LazyListState) null, r6, (C142878fk) null, modifier2, new RepositoryInfoFragment$RepositoryList$1(list2, this), 12583296 | ((i >> 3) & 14), 122, false, true);
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new RepositoryInfoFragment$RepositoryList$2(this, list2, modifier2, i4, i3));
        }
    }

    /* access modifiers changed from: private */
    public final RepositoryInfoViewModel getViewModel() {
        return (RepositoryInfoViewModel) this.viewModel$delegate.getValue();
    }

    public RepositoryInfoFragment() {
        RepositoryInfoFragment$viewModel$2 repositoryInfoFragment$viewModel$2 = new RepositoryInfoFragment$viewModel$2(this);
        C04530Oa A01 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new RepositoryInfoFragment$special$$inlined$viewModels$default$2(new RepositoryInfoFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = C18220wO.A0M(new RepositoryInfoFragment$special$$inlined$viewModels$default$3(A01), repositoryInfoFragment$viewModel$2, new RepositoryInfoFragment$special$$inlined$viewModels$default$4((AnonymousClass0ZU) null, A01), C18210wN.A0l(RepositoryInfoViewModel.class));
    }

    public static final boolean ExpandableColumn$lambda$1(C147368pE r0) {
        return C86104wH.A1X(r0);
    }

    public final void HeaderPreview(C147188nY r4, int i) {
        r4.Cvd(194352208);
        Header((Modifier) null, r4, 64, 1);
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new RepositoryInfoFragment$HeaderPreview$1(this, i));
        }
    }

    public final void RepositoryItemPreview(C147188nY r9, int i) {
        r9.Cvd(1625428320);
        RepositoryItem(new RepositoryInfoViewModel.RepositoryInfo("TestRepository", "Some extra info", (RepositoryInfoViewModel.MemoryCacheStats) null), (Modifier) null, r9, 512, 2);
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new RepositoryInfoFragment$RepositoryItemPreview$1(this, i));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1550472876);
        ComposeView A00 = AnonymousClass6QR.A00(this, AnonymousClass7WY.A00(new RepositoryInfoFragment$onCreateView$1(this), -1417991799));
        C14030oh.A09(-901738958, A02);
        return A00;
    }

    public static final void ExpandableColumn$lambda$2(C147368pE r0, boolean z) {
        C147368pE.A04(r0, z);
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.session$delegate);
    }
}
