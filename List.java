package Lab_02;

public class List<T> {
	
	private Node<T> root;
	private int contador = 0;

	public boolean isEmpty() {
		return this.root == null;
	}
	
	public void clear() {
		this.root = null;
	}

	public void add(T elemento){ //para añadir al final

		Node<T> nodo = new Node<T>(elemento);

		if (root == null)
			root = nodo;
		else{

			Node<T> puntero = root;

			while(puntero.getNextNode() != null)
				puntero = puntero.getNextNode();

			puntero.setNextNode(nodo);
		}
		contador++;
	}

	public void add(int indice, T elemento){

		if (root == null || indice < 0 || indice > size - 1)
			System.out.println("Indice no encontrado");
		
		else if (indice == 0){
			Node<T> nodo = new Node<T>(elemento);
			nodo.setNextNode(root);
			root = nodo;
			contador++;
		}
		
		else if (indice == contador - 1)
			add(elemento);
		
		else {
			Node<T> nodo = new Node<N>(elemento);
			Node<T> puntero = root;

			for (int i = 0; i < indice - 1; i++)
				puntero = puntero.getNextNode();
		
			Node<T> auxiliar = puntero.getNextNode();
			puntero.setNextNode(nodo);
			nodo.setNextNode(auxiliar);

			contador++;
		}
	}

	public Node<T> get(int indice){ //recibe el indice para extraer el elemento

		Node<N> puntero = root;
		
		if (root == null || indice < 0 || indice > contador - 1)
			puntero = null;
		
		else{
			for (int i = 0; i < indice; i++)
				puntero = puntero.getNextNode();
		}
		return puntero;
	}

	public void remove(int indice){

		if (root == null || indice < 0 || indice > contador	- 1)
			System.out.println("La lista esta vacia o no existe el indice");
		
		else{

			Node<N> puntero = root;

			fot (int i = 0; i < indice - 1; i++)
				puntero = puntero.getNextNode();

			Node<N> auxiliar = puntero.getNextNode().getNextNode();
			puntero.getNextNode().setNextNode(null);

			puntero.setNextNode(auxiliar);

			contador--;
		}
	}
}	
