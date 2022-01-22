package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;


public class PrimeNumber {
	/*
	 * Find list of Prime numbers from number 2 to 1 million.
	 * Try the best solution as possible.Which will take less CPU life cycle.
	 * Out put number of Prime numbers on the given range.
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 */

	public static void main(String[] args) {
		int size= findPrimes(2,1000).size();
		ArrayList<Integer> sqlprime= findPrimes(2,1000);
		int[] array = sqlprime.stream().mapToInt(i -> i).toArray();
        System.out.println("The number of element is: "+size+"\n The list of prime numbers is: "+findPrimes(2,1000));
		ConnectToSqlDB primNumb=new ConnectToSqlDB();
		primNumb.insertDataFromArrayToSqlTable(array,"prime_numbers","ID");


	}

	public static ArrayList<Integer> findPrimes(int start,int end) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int j = 0; j < primes.size(); j++) {
			System.out.println("number of out put is" + primes.contains(j));
		}
			for (int n = start; n < end; n++) {
				boolean prime = true;
				int i = 2;
				while (i <= n / 2) {
					if (n % i == 0) {
						prime = false;
						break;
					}
					i++;
				}
				if (prime) {
					primes.add(n);
				}

					}

			return primes;
		}

	}
