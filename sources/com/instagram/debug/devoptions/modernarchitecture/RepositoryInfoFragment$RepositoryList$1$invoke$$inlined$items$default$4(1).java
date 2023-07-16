package com.instagram.debug.devoptions.modernarchitecture;

import X.AnonymousClass0YC;
import X.AnonymousClass0wJ;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C04220Ms;
import X.C141678cb;
import X.C147188nY;
import androidx.compose.ui.Modifier;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel;
import java.util.List;
import kotlin.Unit;

public final class RepositoryInfoFragment$RepositoryList$1$invoke$$inlined$items$default$4 extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ List $items;
    public final /* synthetic */ RepositoryInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$RepositoryList$1$invoke$$inlined$items$default$4(List list, RepositoryInfoFragment repositoryInfoFragment) {
        super(4);
        this.$items = list;
        this.this$0 = repositoryInfoFragment;
    }

    public final void invoke(C141678cb r11, int i, C147188nY r13, int i2) {
        int i3;
        C04220Ms.A0B(r11, 0);
        C147188nY r7 = r13;
        if ((i2 & 14) == 0) {
            i3 = C147188nY.A0F(r13, r11) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= C147188nY.A04(r13, i);
        }
        if ((i3 & 731) != 146 || !r13.BCM()) {
            int i4 = i3 & 14;
            RepositoryInfoViewModel.RepositoryInfo repositoryInfo = (RepositoryInfoViewModel.RepositoryInfo) this.$items.get(i);
            r13.Cvb(356572310);
            if ((i4 & 112) == 0) {
                i4 |= C147188nY.A08(r13, repositoryInfo);
            }
            if ((i4 & 721) != 144 || !r13.BCM()) {
                this.this$0.RepositoryItem(repositoryInfo, (Modifier) null, r7, ((i4 >> 3) & 14) | 512, 2);
            } else {
                r13.CuJ();
            }
            AnonymousClass7W3.A0z(r13, false);
            return;
        }
        r13.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C141678cb) obj, AnonymousClass0wJ.A04(obj2), (C147188nY) obj3, AnonymousClass0wJ.A04(obj4));
        return Unit.A00;
    }
}
