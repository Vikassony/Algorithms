// For finding the number of all prime till given number
// O(N log(log N))

public int countPrimes(int n) {
        if(n<=1 || n==2)
            return 0;
        int prime[] = new int [n+1];
        for(int i=0;i<n;i++)
        {
            prime[i]=1;
        }
        prime[0]=0;
        prime[1]=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(prime[i]==1)
            {
                for(int j=2;i*j<=n;j++)
                {
                    prime[i*j]=0;
                }
            }
        }
        int count=0;
        for(int i=0;i<prime.length;i++)
            if(prime[i]==1)
                count++;
        return count;
    }
