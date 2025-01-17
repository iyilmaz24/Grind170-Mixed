public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        
        int l = 1, r = n, mid;

        while(l <= r) {
            mid = l + ((r - l) / 2);

            if (isBadVersion(mid)) r = mid - 1;
            else l = mid + 1;
        }

        return l;
    }
}
