package com.instagram.debug.devoptions.modernarchitecture;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import java.util.List;

public final class RepositoryInfoFragment$RepositoryList$1$invoke$$inlined$items$default$2 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ List $items;
    public final /* synthetic */ AnonymousClass0YY $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$RepositoryList$1$invoke$$inlined$items$default$2(AnonymousClass0YY r2, List list) {
        super(1);
        this.$key = r2;
        this.$items = list;
    }

    public final Object invoke(int i) {
        return this.$key.invoke(this.$items.get(i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(AnonymousClass0wJ.A04(obj));
    }
}
