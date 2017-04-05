public class Material{
	public static Material instancia;

	protected int totalCadernos;
	protected int totalLivros;
	protected int totalFolhas;

	private Material(){
	}

	public static Material getInstancia(){
		if(instancia==null)
			instancia = new Material();
		return instancia;
	}

}
