class QuickSort{
	
	public static void quick_sort(Livro[] v,int ini, int fim) {
		   int meio;
		 
		   if (ini < fim) {
		     meio = partition(v, ini, fim);
		     quick_sort(v, ini, meio);
		     quick_sort(v, meio + 1, fim);
		   }
		 }
		 
		 public static int partition(Livro[] v, int ini, int fim) {
		   Livro pivo;
		   int topo, i;
		   pivo = v[ini];
		   topo = ini;
		 
		   for (i = ini + 1; i <= fim; i++) {
		     if (v[i].getCodCatalogo() < pivo.getCodCatalogo()) {
		       v[topo] = v[i];
		       v[i] = v[topo + 1];
		       topo++;
		     }
		   }
		   v[topo] = pivo;
		   return topo;
		 }
}