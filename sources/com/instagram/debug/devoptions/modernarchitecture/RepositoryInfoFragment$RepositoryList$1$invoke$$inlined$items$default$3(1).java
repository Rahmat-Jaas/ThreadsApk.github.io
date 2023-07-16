package com.instagram.debug.devoptions.modernarchitecture;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import java.util.List;

public final class RepositoryInfoFragment$RepositoryList$1$invoke$$inlined$items$default$3 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ AnonymousClass0YY $contentType;
    public final /* synthetic */ List $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$RepositoryList$1$invoke$$inlined$items$default$3(AnonymousClass0YY r2, List list) {
        super(1);
        this.$contentType = r2;
        this.$items = list;
    }

    public final Object invoke(int i) {
        return this.$contentType.invoke(this.$items.get(i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(AnonymousClass0wJ.A04(obj));
    }
}
