package com.instagram.debug.devoptions;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18210wN;
import X.C18240wQ;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class InboxV2Variant extends AnonymousClass0Sf implements Variant {
    public static final Companion Companion = new Companion();
    public final boolean activeNowEnabled;
    public final DirectInboxFlags flags;
    public final String hubLayoutType;
    public String humanName = "";
    public String name = "";

    public static /* synthetic */ InboxV2Variant copy$default(InboxV2Variant inboxV2Variant, DirectInboxFlags directInboxFlags, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            directInboxFlags = inboxV2Variant.flags;
        }
        if ((i & 2) != 0) {
            str = inboxV2Variant.hubLayoutType;
        }
        if ((i & 4) != 0) {
            z = inboxV2Variant.activeNowEnabled;
        }
        return inboxV2Variant.copy(directInboxFlags, str, z);
    }

    public final DirectInboxFlags component1() {
        return this.flags;
    }

    public final String component2() {
        return this.hubLayoutType;
    }

    public final boolean component3() {
        return this.activeNowEnabled;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InboxV2Variant) {
                InboxV2Variant inboxV2Variant = (InboxV2Variant) obj;
                if (!C04220Ms.A0I(this.flags, inboxV2Variant.flags) || !C04220Ms.A0I(this.hubLayoutType, inboxV2Variant.hubLayoutType) || this.activeNowEnabled != inboxV2Variant.activeNowEnabled) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void setHumanName(String str) {
        C04220Ms.A0B(str, 0);
        this.humanName = str;
    }

    public void setName(String str) {
        C04220Ms.A0B(str, 0);
        this.name = str;
    }

    public String toString() {
        return super.toString();
    }

    public final class Companion {
        public final InboxV2Variant createFromFlags(DirectInboxFlags directInboxFlags) {
            C04220Ms.A0B(directInboxFlags, 0);
            return new InboxV2Variant(directInboxFlags, (String) directInboxFlags.getStringFlag("hub_layout_type").getCurrentValue(), AnonymousClass0wJ.A1X(C18240wQ.A0Z(directInboxFlags, "is_active_now_enabled")));
        }

        public final InboxV2Variant create(String str, String str2, DirectInboxFlags directInboxFlags, String str3, boolean z) {
            AnonymousClass0wJ.A1N(str, str2);
            AnonymousClass0wJ.A1Q(directInboxFlags, str3);
            InboxV2Variant inboxV2Variant = new InboxV2Variant(directInboxFlags, str3, z);
            inboxV2Variant.setHumanName(str);
            inboxV2Variant.setName(str2);
            return inboxV2Variant;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final boolean getActiveNowEnabled() {
        return this.activeNowEnabled;
    }

    public final DirectInboxFlags getFlags() {
        return this.flags;
    }

    public final String getHubLayoutType() {
        return this.hubLayoutType;
    }

    public String getHumanName() {
        return this.humanName;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int A07 = AnonymousClass0wJ.A07(this.hubLayoutType, C18210wN.A04(this.flags));
        boolean z = this.activeNowEnabled;
        if (z) {
            z = true;
        }
        return A07 + (z ? 1 : 0);
    }

    public boolean isActive() {
        return C04220Ms.A0I(Companion.createFromFlags(this.flags), this);
    }

    public void setOverrides() {
        this.flags.getStringFlag("hub_layout_type").overrideValue(this.hubLayoutType);
        this.flags.getBooleanFlag("is_active_now_enabled").overrideValue(Boolean.valueOf(this.activeNowEnabled));
    }

    public InboxV2Variant(DirectInboxFlags directInboxFlags, String str, boolean z) {
        AnonymousClass0wJ.A1O(directInboxFlags, str);
        this.flags = directInboxFlags;
        this.hubLayoutType = str;
        this.activeNowEnabled = z;
    }

    public final InboxV2Variant copy(DirectInboxFlags directInboxFlags, String str, boolean z) {
        AnonymousClass0wJ.A1N(directInboxFlags, str);
        return new InboxV2Variant(directInboxFlags, str, z);
    }
}
