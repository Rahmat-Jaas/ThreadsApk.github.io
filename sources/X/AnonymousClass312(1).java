package X;

import com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl;

/* renamed from: X.312  reason: invalid class name */
public final class AnonymousClass312 {
    public static IGFxImBusinessReminderQueryResponseImpl A00;

    public static IGFxImBusinessReminderQueryResponseImpl.FxIdentityManagement.BciReminderContent A00() {
        IGFxImBusinessReminderQueryResponseImpl iGFxImBusinessReminderQueryResponseImpl = A00;
        if (iGFxImBusinessReminderQueryResponseImpl == null) {
            return null;
        }
        Class<IGFxImBusinessReminderQueryResponseImpl.FxIdentityManagement> cls = IGFxImBusinessReminderQueryResponseImpl.FxIdentityManagement.class;
        if (iGFxImBusinessReminderQueryResponseImpl.getTreeValue("fx_identity_management", cls) != null) {
            return (IGFxImBusinessReminderQueryResponseImpl.FxIdentityManagement.BciReminderContent) A00.getTreeValue("fx_identity_management", cls).getTreeValue("bci_reminder_content", IGFxImBusinessReminderQueryResponseImpl.FxIdentityManagement.BciReminderContent.class);
        }
        return null;
    }
}
