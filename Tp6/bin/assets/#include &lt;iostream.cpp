#include &lt;iostream.h&gt;
class Habilidades
{
    char habilidad1[15];
    char habilidad2[15];
};
class Empleado
{
    public:
    virtual void imprime_cargo()
    {
        cout &lt;&lt; &quot;Cargo no definido&quot; &lt;&lt; endl;
    }
};

class Directivo:public Empleado
{
    Habilidades uno;
    void imprime_cargo()
    {
        cout &lt;&lt; &quot;Es un directivo&quot; &lt;&lt; endl;
    }
};
class Operario:public Empleado
{
    Habilidades dos;
    void imprime_cargo()
    {
        cout &lt;&lt; &quot;Es un operario&quot; &lt;&lt; endl;
    }
};

class Oficial:public Operario
{
    Habilidades tres;
    void imprime_cargo()
    {
        cout &lt;&lt; &quot;Es un operario oficial&quot; &lt;&lt; endl;
    }
};

class Tecnico:public Operario
{
    Habilidades cuatro;
    void imprime_cargo()
    {
        cout &lt;&lt; &quot;Es un operario tecnico&quot; &lt;&lt; endl;
    }
};

void imprimir(Empleado&amp; i)
{
    i.imprime_cargo();
}
main()
{
    Oficial Rafael ;
    Tecnico Miguel;
    Directivo Gabriel;
    cout &lt;&lt; &quot;Rafael&quot; &lt;&lt; endl;
    imprimir(Rafael);
    cout &lt;&lt; &quot;Gabriel&quot; &lt;&lt; endl;
    imprimir(Gabriel);
    cout &lt;&lt; &quot;Miguel&quot; &lt;&lt; endl;
    imprimir(Miguel);

}