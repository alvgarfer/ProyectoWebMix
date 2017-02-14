package proyectoweb;

public class PatologiaService
{
	public PatologiaDTO buscarPatologiaPorID (int id)
	{
		PatologiaDTO pato = null;
		PatologiaDAO pdao = new PatologiaDAO();
		
			pato = pdao.getPalogiaPorID(id);
		
		return pato;
	}
	
	public PatologiaDTO buscarPatologiaPorNombre (String nombre)
	{
		return null;
	}
}
