package X;

/* renamed from: X.68u  reason: invalid class name and case insensitive filesystem */
public enum C972968u {
    DEVICE_IDLE_REQUIRED("DeviceIdleRequired"),
    EXTERNAL_POWER_REQUIRED("ExternalPowerRequired"),
    WIFI_REQUIRED("WiFiConnectivityRequired"),
    MAX_EXECUTION_TIME_SEC("MaximumExecutionTime"),
    MAX_EXECUTION_TIME_PER_DAY_SEC("MaximumExecutionTimePerDay"),
    MAX_NETWORK_CONSUMPTION_PER_DAY_BYTES("MaximumNetworkConsumptionPerDay"),
    MIN_BATTERY_LEVEL("MinimumBatteryLevel"),
    MIN_AVAILABLE_MEMORY_BYTES("MinimumAvailableMemory"),
    MIN_EVICTABLE_MEMORY_BYTES("MinimumEvictableMemory");
    
    public final String A00;

    /* access modifiers changed from: public */
    C972968u(String str) {
        this.A00 = str;
    }
}
