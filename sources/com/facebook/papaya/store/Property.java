package com.facebook.papaya.store;

import X.C04220Ms;
import X.C973168w;

public final class Property {
    public final long id;
    public final C973168w type;
    public final Object value;

    private final int getTypeCode() {
        return this.type.A00;
    }

    public final long getId() {
        return this.id;
    }

    public final C973168w getType() {
        return this.type;
    }

    public final Object getValue() {
        return this.value;
    }

    public Property(long j, Object obj, int i) {
        this.id = j;
        this.type = C973168w.values()[i];
        this.value = obj;
    }

    public Property(long j, Object obj, C973168w r5) {
        C04220Ms.A0B(r5, 3);
        this.id = j;
        this.type = r5;
        this.value = obj;
    }
}
