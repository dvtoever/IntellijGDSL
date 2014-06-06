/**
 * @author D. van 't Oever
 *
 * This example script illustrates the use of gdsl support
 *
 * This allows for syntax checking of internal DSL files.
 */


MultiChannelForm(title: 'test') {
    Step(name: 'step1') {
        Container(test: 'lala') {}
    }
    Step(name: 'secondName')
}