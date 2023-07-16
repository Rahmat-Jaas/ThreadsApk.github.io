package X;

/* renamed from: X.0Bu  reason: invalid class name and case insensitive filesystem */
public abstract class C02530Bu {
    public abstract void onEventReceivedWithParamsCollectionMap(AnonymousClass0KD r1, AnonymousClass0CU r2);

    public void onEventsWritten(int i) {
    }

    public final void onEventReceived() {
        throw new UnsupportedOperationException("The debug event listener expects only onEventReceivedWithParamsCollectionMap to be called. For production, use EventListener instead.");
    }
}
